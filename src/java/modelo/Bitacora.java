/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author AbiiEcheverria
 */
@Entity
@Table(name = "bitacora")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bitacora.findAll", query = "SELECT b FROM Bitacora b"),
    @NamedQuery(name = "Bitacora.findByBitacoraId", query = "SELECT b FROM Bitacora b WHERE b.bitacoraId = :bitacoraId"),
    @NamedQuery(name = "Bitacora.findByBitacoraFecha", query = "SELECT b FROM Bitacora b WHERE b.bitacoraFecha = :bitacoraFecha")})
public class Bitacora implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bitacora_id")
    private Integer bitacoraId;
    @Column(name = "bitacora_fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bitacoraFecha;
    @Lob
    @Column(name = "bitacora_foto1")
    private byte[] bitacoraFoto1;
    @Lob
    @Column(name = "bitacora_foto2")
    private byte[] bitacoraFoto2;
    @Lob
    @Column(name = "bitacora_descripcion")
    private String bitacoraDescripcion;
    @JoinColumn(name = "Proyecto_express_proyecto_id", referencedColumnName = "proyecto_id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private ProyectoExpress proyectoexpressproyectoid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bitacorabitacoraid", fetch = FetchType.EAGER)
    private List<Material> materialList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bitacora", fetch = FetchType.EAGER)
    private List<BitacoraHasRecursoHumano> bitacoraHasRecursoHumanoList;

    public Bitacora() {
    }

    public Bitacora(Integer bitacoraId) {
        this.bitacoraId = bitacoraId;
    }

    public Integer getBitacoraId() {
        return bitacoraId;
    }

    public void setBitacoraId(Integer bitacoraId) {
        this.bitacoraId = bitacoraId;
    }

    public Date getBitacoraFecha() {
        return bitacoraFecha;
    }

    public void setBitacoraFecha(Date bitacoraFecha) {
        this.bitacoraFecha = bitacoraFecha;
    }

    public byte[] getBitacoraFoto1() {
        return bitacoraFoto1;
    }

    public void setBitacoraFoto1(byte[] bitacoraFoto1) {
        this.bitacoraFoto1 = bitacoraFoto1;
    }

    public byte[] getBitacoraFoto2() {
        return bitacoraFoto2;
    }

    public void setBitacoraFoto2(byte[] bitacoraFoto2) {
        this.bitacoraFoto2 = bitacoraFoto2;
    }

    public String getBitacoraDescripcion() {
        return bitacoraDescripcion;
    }

    public void setBitacoraDescripcion(String bitacoraDescripcion) {
        this.bitacoraDescripcion = bitacoraDescripcion;
    }

    public ProyectoExpress getProyectoexpressproyectoid() {
        return proyectoexpressproyectoid;
    }

    public void setProyectoexpressproyectoid(ProyectoExpress proyectoexpressproyectoid) {
        this.proyectoexpressproyectoid = proyectoexpressproyectoid;
    }

    @XmlTransient
    public List<Material> getMaterialList() {
        return materialList;
    }

    public void setMaterialList(List<Material> materialList) {
        this.materialList = materialList;
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
        hash += (bitacoraId != null ? bitacoraId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bitacora)) {
            return false;
        }
        Bitacora other = (Bitacora) object;
        if ((this.bitacoraId == null && other.bitacoraId != null) || (this.bitacoraId != null && !this.bitacoraId.equals(other.bitacoraId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Bitacora[ bitacoraId=" + bitacoraId + " ]";
    }
    
}
