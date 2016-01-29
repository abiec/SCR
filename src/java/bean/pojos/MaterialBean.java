/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean.pojos;

import dao.real.MaterialDAO;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Material;

/**
 *
 * @author AbiiEcheverria
 */
@ManagedBean
@SessionScoped
public class MaterialBean {
    Material material = new Material();
    MaterialDAO materialDAO = new MaterialDAO();
    List<MaterialBean> lista = new ArrayList<MaterialBean>();

    /**
     * Creates a new instance of Material
     */
    public MaterialBean() {
    }
    
}
