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
public class BitacoraHasRecursoHumanoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "Bitacora_bitacora_id")
    private int bitacorabitacoraid;
    @Basic(optional = false)
    @Column(name = "Recurso_Humano_recursoHumano_id")
    private int recursoHumanorecursoHumanoid;

    public BitacoraHasRecursoHumanoPK() {
    }

    public BitacoraHasRecursoHumanoPK(int bitacorabitacoraid, int recursoHumanorecursoHumanoid) {
        this.bitacorabitacoraid = bitacorabitacoraid;
        this.recursoHumanorecursoHumanoid = recursoHumanorecursoHumanoid;
    }

    public int getBitacorabitacoraid() {
        return bitacorabitacoraid;
    }

    public void setBitacorabitacoraid(int bitacorabitacoraid) {
        this.bitacorabitacoraid = bitacorabitacoraid;
    }

    public int getRecursoHumanorecursoHumanoid() {
        return recursoHumanorecursoHumanoid;
    }

    public void setRecursoHumanorecursoHumanoid(int recursoHumanorecursoHumanoid) {
        this.recursoHumanorecursoHumanoid = recursoHumanorecursoHumanoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) bitacorabitacoraid;
        hash += (int) recursoHumanorecursoHumanoid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BitacoraHasRecursoHumanoPK)) {
            return false;
        }
        BitacoraHasRecursoHumanoPK other = (BitacoraHasRecursoHumanoPK) object;
        if (this.bitacorabitacoraid != other.bitacorabitacoraid) {
            return false;
        }
        if (this.recursoHumanorecursoHumanoid != other.recursoHumanorecursoHumanoid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.BitacoraHasRecursoHumanoPK[ bitacorabitacoraid=" + bitacorabitacoraid + ", recursoHumanorecursoHumanoid=" + recursoHumanorecursoHumanoid + " ]";
    }
    
}
