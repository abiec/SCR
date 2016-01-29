/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author AbiiEcheverria
 */
@Entity
@Table(name = "estatus_proyecto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstatusProyecto.findAll", query = "SELECT e FROM EstatusProyecto e"),
    @NamedQuery(name = "EstatusProyecto.findByEstatusProyectoid", query = "SELECT e FROM EstatusProyecto e WHERE e.estatusProyectoid = :estatusProyectoid"),
    @NamedQuery(name = "EstatusProyecto.findByEstatusProyectonombre", query = "SELECT e FROM EstatusProyecto e WHERE e.estatusProyectonombre = :estatusProyectonombre")})
public class EstatusProyecto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "estatusProyecto_id")
    private Integer estatusProyectoid;
    @Column(name = "estatusProyecto_nombre")
    private String estatusProyectonombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estatusProyecto", fetch = FetchType.EAGER)
    private List<ProyectoExpressHasEstatusProyecto> proyectoExpressHasEstatusProyectoList;

    public EstatusProyecto() {
    }

    public EstatusProyecto(Integer estatusProyectoid) {
        this.estatusProyectoid = estatusProyectoid;
    }

    public Integer getEstatusProyectoid() {
        return estatusProyectoid;
    }

    public void setEstatusProyectoid(Integer estatusProyectoid) {
        this.estatusProyectoid = estatusProyectoid;
    }

    public String getEstatusProyectonombre() {
        return estatusProyectonombre;
    }

    public void setEstatusProyectonombre(String estatusProyectonombre) {
        this.estatusProyectonombre = estatusProyectonombre;
    }

    @XmlTransient
    public List<ProyectoExpressHasEstatusProyecto> getProyectoExpressHasEstatusProyectoList() {
        return proyectoExpressHasEstatusProyectoList;
    }

    public void setProyectoExpressHasEstatusProyectoList(List<ProyectoExpressHasEstatusProyecto> proyectoExpressHasEstatusProyectoList) {
        this.proyectoExpressHasEstatusProyectoList = proyectoExpressHasEstatusProyectoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estatusProyectoid != null ? estatusProyectoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstatusProyecto)) {
            return false;
        }
        EstatusProyecto other = (EstatusProyecto) object;
        if ((this.estatusProyectoid == null && other.estatusProyectoid != null) || (this.estatusProyectoid != null && !this.estatusProyectoid.equals(other.estatusProyectoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.EstatusProyecto[ estatusProyectoid=" + estatusProyectoid + " ]";
    }
    
}
