/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author sawad
 */
@Entity
@Table(name = "clinic")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clinic.findAll", query = "SELECT c FROM Clinic c")
    , @NamedQuery(name = "Clinic.findById", query = "SELECT c FROM Clinic c WHERE c.id = :id")
    , @NamedQuery(name = "Clinic.findByImage", query = "SELECT c FROM Clinic c WHERE c.image = :image")
    , @NamedQuery(name = "Clinic.findByName", query = "SELECT c FROM Clinic c WHERE c.name = :name")
    , @NamedQuery(name = "Clinic.findByPhones", query = "SELECT c FROM Clinic c WHERE c.phones = :phones")})
public class Clinic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Size(max = 255)
    @Column(name = "image")
    private String image;
    @Size(max = 255)
    @Column(name = "name")
    private String name;
    @Size(max = 255)
    @Column(name = "phones")
    private String phones;
    @JoinTable(name = "clinic_insurance", joinColumns = {
        @JoinColumn(name = "clinics_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "insurances_id", referencedColumnName = "id")})
    @ManyToMany
    private Collection<Insurance> insuranceCollection;
    @OneToMany(mappedBy = "clinicId")
    private Collection<Userauth> userauthCollection;
    @JoinColumn(name = "area_id", referencedColumnName = "id")
    @ManyToOne
    private Area areaId;

    public Clinic() {
    }

    public Clinic(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    @XmlTransient
    public Collection<Insurance> getInsuranceCollection() {
        return insuranceCollection;
    }

    public void setInsuranceCollection(Collection<Insurance> insuranceCollection) {
        this.insuranceCollection = insuranceCollection;
    }

    @XmlTransient
    public Collection<Userauth> getUserauthCollection() {
        return userauthCollection;
    }

    public void setUserauthCollection(Collection<Userauth> userauthCollection) {
        this.userauthCollection = userauthCollection;
    }

    public Area getAreaId() {
        return areaId;
    }

    public void setAreaId(Area areaId) {
        this.areaId = areaId;
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
        if (!(object instanceof Clinic)) {
            return false;
        }
        Clinic other = (Clinic) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Clinic[ id=" + id + " ]";
    }
    
}
