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
@Table(name = "proyecto_express")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProyectoExpress.findAll", query = "SELECT p FROM ProyectoExpress p"),
    @NamedQuery(name = "ProyectoExpress.findByProyectoId", query = "SELECT p FROM ProyectoExpress p WHERE p.proyectoId = :proyectoId"),
    @NamedQuery(name = "ProyectoExpress.findByProyectofechaInicio", query = "SELECT p FROM ProyectoExpress p WHERE p.proyectofechaInicio = :proyectofechaInicio"),
    @NamedQuery(name = "ProyectoExpress.findByProeyctofechaFin", query = "SELECT p FROM ProyectoExpress p WHERE p.proeyctofechaFin = :proeyctofechaFin"),
    @NamedQuery(name = "ProyectoExpress.findByProyectoSolicitante", query = "SELECT p FROM ProyectoExpress p WHERE p.proyectoSolicitante = :proyectoSolicitante"),
    @NamedQuery(name = "ProyectoExpress.findByProyectoEmpresa", query = "SELECT p FROM ProyectoExpress p WHERE p.proyectoEmpresa = :proyectoEmpresa")})
public class ProyectoExpress implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "proyecto_id")
    private Integer proyectoId;
    @Column(name = "proyecto_fechaInicio")
    @Temporal(TemporalType.DATE)
    private Date proyectofechaInicio;
    @Column(name = "proeycto_fechaFin")
    @Temporal(TemporalType.DATE)
    private Date proeyctofechaFin;
    @Column(name = "proyecto_solicitante")
    private String proyectoSolicitante;
    @Column(name = "proyecto_empresa")
    private String proyectoEmpresa;
    @Lob
    @Column(name = "proyecto_descripcion")
    private String proyectoDescripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proyectoexpressproyectoid", fetch = FetchType.EAGER)
    private List<Bitacora> bitacoraList;
    @JoinColumn(name = "Usuario_usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Usuario usuariousuarioid;
    @JoinColumn(name = "Base_base_id", referencedColumnName = "base_id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Base basebaseid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proyectoExpress", fetch = FetchType.EAGER)
    private List<ProyectoExpressHasEstatusProyecto> proyectoExpressHasEstatusProyectoList;

    public ProyectoExpress() {
    }

    public ProyectoExpress(Integer proyectoId) {
        this.proyectoId = proyectoId;
    }

    public Integer getProyectoId() {
        return proyectoId;
    }

    public void setProyectoId(Integer proyectoId) {
        this.proyectoId = proyectoId;
    }

    public Date getProyectofechaInicio() {
        return proyectofechaInicio;
    }

    public void setProyectofechaInicio(Date proyectofechaInicio) {
        this.proyectofechaInicio = proyectofechaInicio;
    }

    public Date getProeyctofechaFin() {
        return proeyctofechaFin;
    }

    public void setProeyctofechaFin(Date proeyctofechaFin) {
        this.proeyctofechaFin = proeyctofechaFin;
    }

    public String getProyectoSolicitante() {
        return proyectoSolicitante;
    }

    public void setProyectoSolicitante(String proyectoSolicitante) {
        this.proyectoSolicitante = proyectoSolicitante;
    }

    public String getProyectoEmpresa() {
        return proyectoEmpresa;
    }

    public void setProyectoEmpresa(String proyectoEmpresa) {
        this.proyectoEmpresa = proyectoEmpresa;
    }

    public String getProyectoDescripcion() {
        return proyectoDescripcion;
    }

    public void setProyectoDescripcion(String proyectoDescripcion) {
        this.proyectoDescripcion = proyectoDescripcion;
    }

    @XmlTransient
    public List<Bitacora> getBitacoraList() {
        return bitacoraList;
    }

    public void setBitacoraList(List<Bitacora> bitacoraList) {
        this.bitacoraList = bitacoraList;
    }

    public Usuario getUsuariousuarioid() {
        return usuariousuarioid;
    }

    public void setUsuariousuarioid(Usuario usuariousuarioid) {
        this.usuariousuarioid = usuariousuarioid;
    }

    public Base getBasebaseid() {
        return basebaseid;
    }

    public void setBasebaseid(Base basebaseid) {
        this.basebaseid = basebaseid;
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
        hash += (proyectoId != null ? proyectoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProyectoExpress)) {
            return false;
        }
        ProyectoExpress other = (ProyectoExpress) object;
        if ((this.proyectoId == null && other.proyectoId != null) || (this.proyectoId != null && !this.proyectoId.equals(other.proyectoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.ProyectoExpress[ proyectoId=" + proyectoId + " ]";
    }
    
}
