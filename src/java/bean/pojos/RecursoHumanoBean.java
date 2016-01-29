/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean.pojos;

import dao.real.RecursoHumanoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.RecursoHumano;

/**
 *
 * @author AbiiEcheverria
 */
@ManagedBean
@SessionScoped
public class RecursoHumanoBean {
    RecursoHumano recursoHumano = new RecursoHumano();
    RecursoHumanoDAO recursoHumanoDAO = new RecursoHumanoDAO();
    List<RecursoHumano> lista = new ArrayList<RecursoHumano>();
    /**
     * Creates a new instance of RecursoHumanoBean
     */
    public RecursoHumanoBean() {
    }
    
}
