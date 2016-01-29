/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean.pojos;

import dao.real.UsuarioDAO;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Usuario;

/**
 *
 * @author AbiiEcheverria
 */
@ManagedBean
@SessionScoped
public class UsuarioBean {
    Usuario usuario = new Usuario();
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    List<Usuario> list = new ArrayList<Usuario>();
    /**
     * Creates a new instance of UsuarioBean
     */
    public UsuarioBean() {
    }
    
}
