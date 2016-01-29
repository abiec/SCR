/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.real;

import dao.basico.DAOGenerico;
import dao.basico.HibernateUtil;
import modelo.Usuario;
import org.hibernate.Query;

/**
 *
 * @author AbiiEcheverria
 */
public class UsuarioDAO extends DAOGenerico<Usuario, Integer>{
    public Usuario verificarUsuario(Usuario usuario) throws Exception {
        Usuario us = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            String hql = "FROM Usuario WHERE usuario_usuario='" + usuario.getUsuarioUsuario() + "' and usuario_contrasenia='" + usuario.getUsuarioContrasenia()
                    + "'";
            Query query = sesion.createQuery(hql);
            if (!query.list().isEmpty()) {
                us = (Usuario) query.list().get(0);
            }
        } catch (Exception e) {
            throw e;
        }
        return us;
    }

}
