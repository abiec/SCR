/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.basico;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
//Para que no hagan instancia de el

public abstract class DAOGenerico<T, Id extends Serializable> implements
        InterfaceDAO<T, Id> {

    protected Session sesion;
    protected Transaction tx;
    protected Class<T> claseDePersistencia;

    public DAOGenerico() {
        this.claseDePersistencia = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Override
    public T buscarPorClave(Id id) {
        T objeto = null;
        try {
            iniciaOperacion();
            objeto = (T) sesion.get(claseDePersistencia, id);
        } finally {
            sesion.close();
        }

        return objeto;

    }

    @Override
    public List<T> buscarTodos() {
        List<T> listaObjetos = null;

        try {
            iniciaOperacion();
            listaObjetos = sesion.createQuery("from " + claseDePersistencia.getSimpleName()).list();
        } finally {
            sesion.close();
        }

        return listaObjetos;

    }

    //Guarda si no tiene relaciones
    @Override
    public Id guardar(T objeto) {
        Id id = null;

        try {
            iniciaOperacion();
            id = (Id) sesion.save(objeto);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }

        return id;
    }

    @Override
    public void modificar(T objeto) {
        try {
            iniciaOperacion();
            sesion.update(objeto);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }

    }

    @Override
    public void borrar(T objeto) {
        try {
            iniciaOperacion();
            sesion.delete(objeto);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }

    }

    protected void iniciaOperacion() throws HibernateException {

        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }

    protected void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }
}
