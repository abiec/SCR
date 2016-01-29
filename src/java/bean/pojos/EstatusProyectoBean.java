/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean.pojos;

import dao.real.EstatusProyectoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.EstatusProyecto;

/**
 *
 * @author AbiiEcheverria
 */
@ManagedBean
@SessionScoped
public class EstatusProyectoBean {

    EstatusProyecto estatusProyecto = new EstatusProyecto();
    EstatusProyectoDAO estatusProyectoDAO = new EstatusProyectoDAO();
    List<EstatusProyecto> lista = new ArrayList<EstatusProyecto>();
    /**
     * Creates a new instance of EstatusProyectoBean
     */
    public EstatusProyectoBean() {
    }
    
}
