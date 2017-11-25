/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Principales;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author M Express
 */
@Entity
@Table(name = "ARBITRO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Arbitro.findAll", query = "SELECT a FROM Arbitro a")
    , @NamedQuery(name = "Arbitro.findByNumeropasaporte", query = "SELECT a FROM Arbitro a WHERE a.numeropasaporte = :numeropasaporte")
    , @NamedQuery(name = "Arbitro.findByFechainicio", query = "SELECT a FROM Arbitro a WHERE a.fechainicio = :fechainicio")})
public class Arbitro implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "NUMEROPASAPORTE")
    private BigDecimal numeropasaporte;
    @Basic(optional = false)
    @Column(name = "FECHAINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicio;
    @JoinColumn(name = "NUMEROPASAPORTE", referencedColumnName = "NUMEROPASAPORTE", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Persona persona;

    public Arbitro() {
    }

    public Arbitro(BigDecimal numeropasaporte) {
        this.numeropasaporte = numeropasaporte;
    }

    public Arbitro(BigDecimal numeropasaporte, Date fechainicio) {
        this.numeropasaporte = numeropasaporte;
        this.fechainicio = fechainicio;
    }

    public BigDecimal getNumeropasaporte() {
        return numeropasaporte;
    }

    public void setNumeropasaporte(BigDecimal numeropasaporte) {
        this.numeropasaporte = numeropasaporte;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeropasaporte != null ? numeropasaporte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arbitro)) {
            return false;
        }
        Arbitro other = (Arbitro) object;
        if ((this.numeropasaporte == null && other.numeropasaporte != null) || (this.numeropasaporte != null && !this.numeropasaporte.equals(other.numeropasaporte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Clases.Principales.Arbitro[ numeropasaporte=" + numeropasaporte + " ]";
    }
    
}
