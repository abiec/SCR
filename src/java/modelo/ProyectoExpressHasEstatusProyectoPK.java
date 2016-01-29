/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author AbiiEcheverria
 */
@Embeddable
public class ProyectoExpressHasEstatusProyectoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "Proyecto_express_proyecto_id")
    private int proyectoexpressproyectoid;
    @Basic(optional = false)
    @Column(name = "estatus_proyecto_estatusProyecto_id")
    private int estatusproyectoestatusProyectoid;

    public ProyectoExpressHasEstatusProyectoPK() {
    }

    public ProyectoExpressHasEstatusProyectoPK(int proyectoexpressproyectoid, int estatusproyectoestatusProyectoid) {
        this.proyectoexpressproyectoid = proyectoexpressproyectoid;
        this.estatusproyectoestatusProyectoid = estatusproyectoestatusProyectoid;
    }

    public int getProyectoexpressproyectoid() {
        return proyectoexpressproyectoid;
    }

    public void setProyectoexpressproyectoid(int proyectoexpressproyectoid) {
        this.proyectoexpressproyectoid = proyectoexpressproyectoid;
    }

    public int getEstatusproyectoestatusProyectoid() {
        return estatusproyectoestatusProyectoid;
    }

    public void setEstatusproyectoestatusProyectoid(int estatusproyectoestatusProyectoid) {
        this.estatusproyectoestatusProyectoid = estatusproyectoestatusProyectoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) proyectoexpressproyectoid;
        hash += (int) estatusproyectoestatusProyectoid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProyectoExpressHasEstatusProyectoPK)) {
            return false;
        }
        ProyectoExpressHasEstatusProyectoPK other = (ProyectoExpressHasEstatusProyectoPK) object;
        if (this.proyectoexpressproyectoid != other.proyectoexpressproyectoid) {
            return false;
        }
        if (this.estatusproyectoestatusProyectoid != other.estatusproyectoestatusProyectoid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.ProyectoExpressHasEstatusProyectoPK[ proyectoexpressproyectoid=" + proyectoexpressproyectoid + ", estatusproyectoestatusProyectoid=" + estatusproyectoestatusProyectoid + " ]";
    }
    
}
