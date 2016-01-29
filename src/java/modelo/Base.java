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
@Table(name = "base")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Base.findAll", query = "SELECT b FROM Base b"),
    @NamedQuery(name = "Base.findByBaseId", query = "SELECT b FROM Base b WHERE b.baseId = :baseId"),
    @NamedQuery(name = "Base.findByBaseNombre", query = "SELECT b FROM Base b WHERE b.baseNombre = :baseNombre")})
public class Base implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "base_id")
    private Integer baseId;
    @Column(name = "base_nombre")
    private String baseNombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "basebaseid", fetch = FetchType.EAGER)
    private List<ProyectoExpress> proyectoExpressList;

    public Base() {
    }

    public Base(Integer baseId) {
        this.baseId = baseId;
    }

    public Integer getBaseId() {
        return baseId;
    }

    public void setBaseId(Integer baseId) {
        this.baseId = baseId;
    }

    public String getBaseNombre() {
        return baseNombre;
    }

    public void setBaseNombre(String baseNombre) {
        this.baseNombre = baseNombre;
    }

    @XmlTransient
    public List<ProyectoExpress> getProyectoExpressList() {
        return proyectoExpressList;
    }

    public void setProyectoExpressList(List<ProyectoExpress> proyectoExpressList) {
        this.proyectoExpressList = proyectoExpressList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (baseId != null ? baseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Base)) {
            return false;
        }
        Base other = (Base) object;
        if ((this.baseId == null && other.baseId != null) || (this.baseId != null && !this.baseId.equals(other.baseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Base[ baseId=" + baseId + " ]";
    }
    
}
