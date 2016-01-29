/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.pojos;

import dao.real.BaseDAO;
import dao.real.ProyectoExpressDAO;
import dao.real.UsuarioDAO;
import java.util.ArrayList;
import java.util.List;
import javafx.event.ActionEvent;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import modelo.Base;
import modelo.ProyectoExpress;
import modelo.Usuario;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Bastar
 */
@ManagedBean
@SessionScoped
public class ProyectoExpressBean {

    /**
     * Creates a new instance of ProyectoExpressBean
     */
    private ProyectoExpress proyectoExpress = new ProyectoExpress();
    private ProyectoExpressDAO proyectoExpressDAO = new ProyectoExpressDAO();
    private List<ProyectoExpress> lista = new ArrayList();

    public ProyectoExpressBean() {
    }

    public ProyectoExpress getProyectoExpress() {
        return proyectoExpress;
    }

    public void setProyectoExpress(ProyectoExpress proyectoExpressBean) {
        this.proyectoExpress = proyectoExpressBean;
    }

    public ProyectoExpressDAO getProyectoExpressDAO() {
        return proyectoExpressDAO;
    }

    public void setProyectoExpressDAO(ProyectoExpressDAO proyectoExpressDAO) {
        this.proyectoExpressDAO = proyectoExpressDAO;
    }

    public List<ProyectoExpress> getLista() {
        return lista;
    }

    public void setLista(List<ProyectoExpress> lista) {
        this.lista = lista;
    }

    public void mensajeError() {
        muestraMensaje("Error", "Error al dar de alta proyecto");
    }

    public void mensajeExito(int i) {
        muestraMensaje("Exito", "Se guardó el proyecto con el código "+i);

    }

    public void muestraMensaje(String titulo, String mensaje) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, titulo, mensaje);
        RequestContext.getCurrentInstance().showMessageInDialog(message);

    }

    public void addNotificacion(String mensaje) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, mensaje, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public void guardarProyecto(int base, int usuario) {

        Base ba = new BaseDAO().buscarPorClave(base);
        Usuario ya = new UsuarioDAO().buscarPorClave(usuario);

        proyectoExpress.setUsuariousuarioid(ya);
        proyectoExpress.setBasebaseid(ba);
        int v = proyectoExpressDAO.guardar(proyectoExpress);
        if (v != 0) {
            mensajeExito(v);
        } else {
            mensajeError();
        }
    }

    public void listarProyectos() {
        lista = proyectoExpressDAO.buscarTodos();
    }

    public String abrirPaginaCargarListaProyectos() {
        listarProyectos();
        return "consulta";
    }

    public void mostrarDetalles(String detalles) {
        muestraMensaje("Detalles del proyecto", detalles);
    }
}
