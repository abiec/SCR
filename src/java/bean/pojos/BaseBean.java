/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.pojos;

import dao.real.BaseDAO;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;
import modelo.Base;

/**
 *
 * @author Bastar
 */
@ManagedBean
@SessionScoped
public class BaseBean {

    /**
     * Creates a new instance of BaseBean
     */
    private Base base = new Base();
    private BaseDAO baseDAO = new BaseDAO();
    private List<Base> list = new ArrayList();
    private List<SelectItem> listSelectItem;

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

    public List<Base> getList() {
        return list;
    }

    public List<SelectItem> listaNombreBases() {
        listSelectItem = new ArrayList();
        List<Base> x = baseDAO.buscarTodos();
    
        for (Base x1 : x) {
            SelectItem baseItem = new SelectItem(x1.getBaseId(), x1.getBaseNombre());
            listSelectItem.add(baseItem);
        }
        return listSelectItem;
    }

    public void setList(List<Base> list) {
        this.list = list;
    }

}
