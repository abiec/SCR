/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.pojos;

import dao.real.UsuarioDAO;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import modelo.Usuario;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Bastar
 */
@ManagedBean
@SessionScoped
public class UsuarioBean {

    /**
     * Creates a new instance of UsuarioBean
     */
    private Usuario usuario = new Usuario();
    private UsuarioDAO usuarioDAO = new UsuarioDAO();
    private List<Usuario> list = new ArrayList();

    public UsuarioBean() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public UsuarioDAO getUsuarioDAO() {
        return usuarioDAO;
    }

    public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    public List<Usuario> getList() {
        return list;
    }

    public void setList(List<Usuario> list) {
        this.list = list;
    }

    public void mensajeNoEntro() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Error", "Error al inciar sesión");
        RequestContext.getCurrentInstance().showMessageInDialog(message);

    }

    public String verificarDatos() throws Exception {
        Usuario us;
        String resultado;
        try {
            us = usuarioDAO.verificarUsuario(usuario);
            if (us != null) {
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
                resultado = "menu";
                usuario=us;
            } else {
                resultado = "index";
                mensajeNoEntro();
            }
        } catch (Exception e) {
            throw e;
        }
        return resultado;
    }

    public boolean verificarSesion() {
        if (FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario") == null) {
            return false;
        } else {
            return true;
        }
    }

    public String cerrarSesion() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "index?faces-redirect=true";
    }

}
