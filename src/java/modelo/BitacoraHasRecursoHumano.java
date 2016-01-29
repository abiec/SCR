/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AbiiEcheverria
 */
@Entity
@Table(name = "bitacora_has_recurso_humano")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BitacoraHasRecursoHumano.findAll", query = "SELECT b FROM BitacoraHasRecursoHumano b"),
    @NamedQuery(name = "BitacoraHasRecursoHumano.findByBitacorabitacoraid", query = "SELECT b FROM BitacoraHasRecursoHumano b WHERE b.bitacoraHasRecursoHumanoPK.bitacorabitacoraid = :bitacorabitacoraid"),
    @NamedQuery(name = "BitacoraHasRecursoHumano.findByRecursoHumanorecursoHumanoid", query = "SELECT b FROM BitacoraHasRecursoHumano b WHERE b.bitacoraHasRecursoHumanoPK.recursoHumanorecursoHumanoid = :recursoHumanorecursoHumanoid"),
    @NamedQuery(name = "BitacoraHasRecursoHumano.findByNumPersonas", query = "SELECT b FROM BitacoraHasRecursoHumano b WHERE b.numPersonas = :numPersonas"),
    @NamedQuery(name = "BitacoraHasRecursoHumano.findByHoras", query = "SELECT b FROM BitacoraHasRecursoHumano b WHERE b.horas = :horas")})
public class BitacoraHasRecursoHumano implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BitacoraHasRecursoHumanoPK bitacoraHasRecursoHumanoPK;
    @Column(name = "num_personas")
    private Integer numPersonas;
    @Column(name = "horas")
    private Integer horas;
    @JoinColumn(name = "Recurso_Humano_recursoHumano_id", referencedColumnName = "recursoHumano_id", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private RecursoHumano recursoHumano;
    @JoinColumn(name = "Bitacora_bitacora_id", referencedColumnName = "bitacora_id", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Bitacora bitacora;

    public BitacoraHasRecursoHumano() {
    }

    public BitacoraHasRecursoHumano(BitacoraHasRecursoHumanoPK bitacoraHasRecursoHumanoPK) {
        this.bitacoraHasRecursoHumanoPK = bitacoraHasRecursoHumanoPK;
    }

    public BitacoraHasRecursoHumano(int bitacorabitacoraid, int recursoHumanorecursoHumanoid) {
        this.bitacoraHasRecursoHumanoPK = new BitacoraHasRecursoHumanoPK(bitacorabitacoraid, recursoHumanorecursoHumanoid);
    }

    public BitacoraHasRecursoHumanoPK getBitacoraHasRecursoHumanoPK() {
        return bitacoraHasRecursoHumanoPK;
    }

    public void setBitacoraHasRecursoHumanoPK(BitacoraHasRecursoHumanoPK bitacoraHasRecursoHumanoPK) {
        this.bitacoraHasRecursoHumanoPK = bitacoraHasRecursoHumanoPK;
    }

    public Integer getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(Integer numPersonas) {
        this.numPersonas = numPersonas;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public RecursoHumano getRecursoHumano() {
        return recursoHumano;
    }

    public void setRecursoHumano(RecursoHumano recursoHumano) {
        this.recursoHumano = recursoHumano;
    }

    public Bitacora getBitacora() {
        return bitacora;
    }

    public void setBitacora(Bitacora bitacora) {
        this.bitacora = bitacora;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bitacoraHasRecursoHumanoPK != null ? bitacoraHasRecursoHumanoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BitacoraHasRecursoHumano)) {
            return false;
        }
        BitacoraHasRecursoHumano other = (BitacoraHasRecursoHumano) object;
        if ((this.bitacoraHasRecursoHumanoPK == null && other.bitacoraHasRecursoHumanoPK != null) || (this.bitacoraHasRecursoHumanoPK != null && !this.bitacoraHasRecursoHumanoPK.equals(other.bitacoraHasRecursoHumanoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.BitacoraHasRecursoHumano[ bitacoraHasRecursoHumanoPK=" + bitacoraHasRecursoHumanoPK + " ]";
    }
    
}
