package bean.pojos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.real.BaseDAO;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Base;

/**
 *
 * @author AbiiEcheverria
 */
@ManagedBean
@SessionScoped
public class BaseBean {

    
    private Base base = new Base();
    private BaseDAO baseDAO = new BaseDAO();
    private List<Base> lista = new ArrayList<Base>();
    /**
     * Creates a new instance of BaseBean
     */
    public BaseBean() {
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public BaseDAO getBaseDAO() {
        return baseDAO;
    }

    public void setBaseDAO(BaseDAO baseDAO) {
        this.baseDAO = baseDAO;
    }

    public List<Base> getLista() {
        return lista;
    }

    public void setLista(List<Base> lista) {
        this.lista = lista;
    }
    
    
    
}
