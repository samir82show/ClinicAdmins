/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sawad
 */
@Entity
@Table(name = "clinicservice")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clinicservice.findAll", query = "SELECT c FROM Clinicservice c")
    , @NamedQuery(name = "Clinicservice.findById", query = "SELECT c FROM Clinicservice c WHERE c.id = :id")
    , @NamedQuery(name = "Clinicservice.findByImage", query = "SELECT c FROM Clinicservice c WHERE c.image = :image")
    , @NamedQuery(name = "Clinicservice.findByName", query = "SELECT c FROM Clinicservice c WHERE c.name = :name")})
public class Clinicservice implements Serializable {

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

    public Clinicservice() {
    }

    public Clinicservice(Long id) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clinicservice)) {
            return false;
        }
        Clinicservice other = (Clinicservice) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Clinicservice[ id=" + id + " ]";
    }
    
}
