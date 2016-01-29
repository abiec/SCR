/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean.pojos;

import dao.real.ProyectoExpressHasEstatusProyectoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.ProyectoExpressHasEstatusProyecto;

/**
 *
 * @author AbiiEcheverria
 */
@ManagedBean
@SessionScoped
public class ProyectoExpressHasEstatusProyectoBean {
    ProyectoExpressHasEstatusProyecto proyectoExpressHasEstatusProyecto = new ProyectoExpressHasEstatusProyecto();
    ProyectoExpressHasEstatusProyectoDAO proyectoExpressHasEstatusProyectoDAO = new ProyectoExpressHasEstatusProyectoDAO();
    List<ProyectoExpressHasEstatusProyecto> lista = new ArrayList<ProyectoExpressHasEstatusProyecto>();
    /**
     * Creates a new instance of ProyectoExpressHasEstatusProyectoBean
     */
    public ProyectoExpressHasEstatusProyectoBean() {
    }
    
}
