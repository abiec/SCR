/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean.pojos;

import dao.real.BitacoraHasRecursoHumanoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.BitacoraHasRecursoHumano;

/**
 *
 * @author AbiiEcheverria
 */
@ManagedBean
@SessionScoped
public class BitacoraHasRecursoHumanoBean {
    
    BitacoraHasRecursoHumano bitacoraHasRecursoHumano = new BitacoraHasRecursoHumano();
    BitacoraHasRecursoHumanoDAO bitacoraHasRecursoHumanoDAO = new BitacoraHasRecursoHumanoDAO();
    List<BitacoraHasRecursoHumano> lista = new ArrayList<BitacoraHasRecursoHumano>();

    /**
     * Creates a new instance of BitacoraHasRecursoHumanoBean
     */
    public BitacoraHasRecursoHumanoBean() {
    }
    
}
