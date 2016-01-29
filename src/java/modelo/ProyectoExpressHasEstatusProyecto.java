/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AbiiEcheverria
 */
@Entity
@Table(name = "proyecto_express_has_estatus_proyecto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProyectoExpressHasEstatusProyecto.findAll", query = "SELECT p FROM ProyectoExpressHasEstatusProyecto p"),
    @NamedQuery(name = "ProyectoExpressHasEstatusProyecto.findByProyectoexpressproyectoid", query = "SELECT p FROM ProyectoExpressHasEstatusProyecto p WHERE p.proyectoExpressHasEstatusProyectoPK.proyectoexpressproyectoid = :proyectoexpressproyectoid"),
    @NamedQuery(name = "ProyectoExpressHasEstatusProyecto.findByEstatusproyectoestatusProyectoid", query = "SELECT p FROM ProyectoExpressHasEstatusProyecto p WHERE p.proyectoExpressHasEstatusProyectoPK.estatusproyectoestatusProyectoid = :estatusproyectoestatusProyectoid"),
    @NamedQuery(name = "ProyectoExpressHasEstatusProyecto.findByFecha", query = "SELECT p FROM ProyectoExpressHasEstatusProyecto p WHERE p.fecha = :fecha")})
public class ProyectoExpressHasEstatusProyecto implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProyectoExpressHasEstatusProyectoPK proyectoExpressHasEstatusProyectoPK;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "estatus_proyecto_estatusProyecto_id", referencedColumnName = "estatusProyecto_id", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private EstatusProyecto estatusProyecto;
    @JoinColumn(name = "Proyecto_express_proyecto_id", referencedColumnName = "proyecto_id", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private ProyectoExpress proyectoExpress;

    public ProyectoExpressHasEstatusProyecto() {
    }

    public ProyectoExpressHasEstatusProyecto(ProyectoExpressHasEstatusProyectoPK proyectoExpressHasEstatusProyectoPK) {
        this.proyectoExpressHasEstatusProyectoPK = proyectoExpressHasEstatusProyectoPK;
    }

    public ProyectoExpressHasEstatusProyecto(int proyectoexpressproyectoid, int estatusproyectoestatusProyectoid) {
        this.proyectoExpressHasEstatusProyectoPK = new ProyectoExpressHasEstatusProyectoPK(proyectoexpressproyectoid, estatusproyectoestatusProyectoid);
    }

    public ProyectoExpressHasEstatusProyectoPK getProyectoExpressHasEstatusProyectoPK() {
        return proyectoExpressHasEstatusProyectoPK;
    }

    public void setProyectoExpressHasEstatusProyectoPK(ProyectoExpressHasEstatusProyectoPK proyectoExpressHasEstatusProyectoPK) {
        this.proyectoExpressHasEstatusProyectoPK = proyectoExpressHasEstatusProyectoPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public EstatusProyecto getEstatusProyecto() {
        return estatusProyecto;
    }

    public void setEstatusProyecto(EstatusProyecto estatusProyecto) {
        this.estatusProyecto = estatusProyecto;
    }

    public ProyectoExpress getProyectoExpress() {
        return proyectoExpress;
    }

    public void setProyectoExpress(ProyectoExpress proyectoExpress) {
        this.proyectoExpress = proyectoExpress;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proyectoExpressHasEstatusProyectoPK != null ? proyectoExpressHasEstatusProyectoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProyectoExpressHasEstatusProyecto)) {
            return false;
        }
        ProyectoExpressHasEstatusProyecto other = (ProyectoExpressHasEstatusProyecto) object;
        if ((this.proyectoExpressHasEstatusProyectoPK == null && other.proyectoExpressHasEstatusProyectoPK != null) || (this.proyectoExpressHasEstatusProyectoPK != null && !this.proyectoExpressHasEstatusProyectoPK.equals(other.proyectoExpressHasEstatusProyectoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.ProyectoExpressHasEstatusProyecto[ proyectoExpressHasEstatusProyectoPK=" + proyectoExpressHasEstatusProyectoPK + " ]";
    }
    
}
