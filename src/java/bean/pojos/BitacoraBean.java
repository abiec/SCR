package bean.pojos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.real.BitacoraDAO;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Bitacora;

/**
 *
 * @author AbiiEcheverria
 */
@ManagedBean
@SessionScoped
public class BitacoraBean {

    private Bitacora bitacora = new Bitacora();
    private BitacoraDAO bitacoraDAO = new BitacoraDAO();
    private List<Bitacora> lista = new ArrayList<Bitacora>();
    /**
     * Creates a new instance of BitacoraBean
     */
    public BitacoraBean() {
    }

    public Bitacora getBitacora() {
        return bitacora;
    }

    public void setBitacora(Bitacora bitacora) {
        this.bitacora = bitacora;
    }

    public BitacoraDAO getBitacoraDAO() {
        return bitacoraDAO;
    }

    public void setBitacoraDAO(BitacoraDAO bitacoraDAO) {
        this.bitacoraDAO = bitacoraDAO;
    }

    public List<Bitacora> getLista() {
        return lista;
    }

    public void setLista(List<Bitacora> lista) {
        this.lista = lista;
    }
    
}
