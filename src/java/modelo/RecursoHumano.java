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
@Table(name = "recurso_humano")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RecursoHumano.findAll", query = "SELECT r FROM RecursoHumano r"),
    @NamedQuery(name = "RecursoHumano.findByRecursoHumanoid", query = "SELECT r FROM RecursoHumano r WHERE r.recursoHumanoid = :recursoHumanoid"),
    @NamedQuery(name = "RecursoHumano.findByRecursoHumanonombre", query = "SELECT r FROM RecursoHumano r WHERE r.recursoHumanonombre = :recursoHumanonombre")})
public class RecursoHumano implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "recursoHumano_id")
    private Integer recursoHumanoid;
    @Column(name = "recursoHumano_nombre")
    private String recursoHumanonombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recursoHumano", fetch = FetchType.EAGER)
    private List<BitacoraHasRecursoHumano> bitacoraHasRecursoHumanoList;

    public RecursoHumano() {
    }

    public RecursoHumano(Integer recursoHumanoid) {
        this.recursoHumanoid = recursoHumanoid;
    }

    public Integer getRecursoHumanoid() {
        return recursoHumanoid;
    }

    public void setRecursoHumanoid(Integer recursoHumanoid) {
        this.recursoHumanoid = recursoHumanoid;
    }

    public String getRecursoHumanonombre() {
        return recursoHumanonombre;
    }

    public void setRecursoHumanonombre(String recursoHumanonombre) {
        this.recursoHumanonombre = recursoHumanonombre;
    }

    @XmlTransient
    public List<BitacoraHasRecursoHumano> getBitacoraHasRecursoHumanoList() {
        return bitacoraHasRecursoHumanoList;
    }

    public void setBitacoraHasRecursoHumanoList(List<BitacoraHasRecursoHumano> bitacoraHasRecursoHumanoList) {
        this.bitacoraHasRecursoHumanoList = bitacoraHasRecursoHumanoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (recursoHumanoid != null ? recursoHumanoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RecursoHumano)) {
            return false;
        }
        RecursoHumano other = (RecursoHumano) object;
        if ((this.recursoHumanoid == null && other.recursoHumanoid != null) || (this.recursoHumanoid != null && !this.recursoHumanoid.equals(other.recursoHumanoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.RecursoHumano[ recursoHumanoid=" + recursoHumanoid + " ]";
    }
    
}
