/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2_uloha2;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Eduardo Martinez
 */
@Entity
@Table(name = "OSOBA_U1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OsobaU1.findAll", query = "SELECT o FROM OsobaU1 o"),
    @NamedQuery(name = "OsobaU1.findById", query = "SELECT o FROM OsobaU1 o WHERE o.id = :id"),
    @NamedQuery(name = "OsobaU1.findByMeno", query = "SELECT o FROM OsobaU1 o WHERE o.meno = :meno"),
    @NamedQuery(name = "OsobaU1.findByNarodena", query = "SELECT o FROM OsobaU1 o WHERE o.narodena = :narodena"),
    @NamedQuery(name = "OsobaU1.findByVaha", query = "SELECT o FROM OsobaU1 o WHERE o.vaha = :vaha"),
    @NamedQuery(name = "OsobaU1.findByVyska", query = "SELECT o FROM OsobaU1 o WHERE o.vyska = :vyska")})
public class OsobaU1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "MENO")
    private String meno;
    @Column(name = "NARODENA")
    @Temporal(TemporalType.DATE)
    private Date narodena;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VAHA")
    private Double vaha;
    @Column(name = "VYSKA")
    private Double vyska;

    public OsobaU1() {
    }

    public OsobaU1(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public Date getNarodena() {
        return narodena;
    }

    public void setNarodena(Date narodena) {
        this.narodena = narodena;
    }

    public Double getVaha() {
        return vaha;
    }

    public void setVaha(Double vaha) {
        this.vaha = vaha;
    }

    public Double getVyska() {
        return vyska;
    }

    public void setVyska(Double vyska) {
        this.vyska = vyska;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OsobaU1)) {
            return false;
        }
        OsobaU1 other = (OsobaU1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "c2_uloha2.OsobaU1[ id=" + id + " ]";
    }
    
}
