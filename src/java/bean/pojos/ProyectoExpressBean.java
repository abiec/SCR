/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean.pojos;

import dao.real.ProyectoExpressDAO;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.ProyectoExpress;

/**
 *
 * @author AbiiEcheverria
 */
@ManagedBean
@SessionScoped
public class ProyectoExpressBean {
    ProyectoExpress proyectoExpressB = new ProyectoExpress();
    ProyectoExpressDAO proyectoExpressDAO = new ProyectoExpressDAO();
    List<ProyectoExpress> lista = new ArrayList<ProyectoExpress>();
    /**
     * Creates a new instance of ProyectoExpressBean
     */
    public ProyectoExpressBean() {
    }
    
}
