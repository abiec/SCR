/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.real;

import modelo.Base;

/**
 *
 * @author Bastar
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BaseDAO baseDAO = new BaseDAO();
        Base base = new Base();
        base.setBaseNombre("Paraiso");
        int x=baseDAO.guardar(base);
        System.out.println("Exito "+x);
    }
    
}
