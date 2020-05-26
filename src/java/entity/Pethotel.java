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
 * @author NGUYEN HOANG BAO
 */
@Entity
@Table(name = "pethotel", catalog = "Project_HK4_PetShop", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pethotel.findAll", query = "SELECT p FROM Pethotel p"),
    @NamedQuery(name = "Pethotel.findByPHId", query = "SELECT p FROM Pethotel p WHERE p.pHId = :pHId"),
    @NamedQuery(name = "Pethotel.findByPhoneCus", query = "SELECT p FROM Pethotel p WHERE p.phoneCus = :phoneCus"),
    @NamedQuery(name = "Pethotel.findByNameCus", query = "SELECT p FROM Pethotel p WHERE p.nameCus = :nameCus"),
    @NamedQuery(name = "Pethotel.findByNamePet", query = "SELECT p FROM Pethotel p WHERE p.namePet = :namePet"),
    @NamedQuery(name = "Pethotel.findByDateStart", query = "SELECT p FROM Pethotel p WHERE p.dateStart = :dateStart"),
    @NamedQuery(name = "Pethotel.findByDateEnd", query = "SELECT p FROM Pethotel p WHERE p.dateEnd = :dateEnd"),
    @NamedQuery(name = "Pethotel.findByPrice", query = "SELECT p FROM Pethotel p WHERE p.price = :price")})
public class Pethotel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PHId", nullable = false)
    private Integer pHId;
    @Size(max = 20)
    @Column(name = "phoneCus", length = 20)
    private String phoneCus;
    @Size(max = 50)
    @Column(name = "nameCus", length = 50)
    private String nameCus;
    @Size(max = 50)
    @Column(name = "namePet", length = 50)
    private String namePet;
    @Size(max = 10)
    @Column(name = "dateStart", length = 10)
    private String dateStart;
    @Size(max = 10)
    @Column(name = "dateEnd", length = 10)
    private String dateEnd;
    @Column(name = "price")
    private Integer price;

    public Pethotel() {
    }

    public Pethotel(Integer pHId) {
        this.pHId = pHId;
    }

    public Integer getPHId() {
        return pHId;
    }

    public void setPHId(Integer pHId) {
        this.pHId = pHId;
    }

    public String getPhoneCus() {
        return phoneCus;
    }

    public void setPhoneCus(String phoneCus) {
        this.phoneCus = phoneCus;
    }

    public String getNameCus() {
        return nameCus;
    }

    public void setNameCus(String nameCus) {
        this.nameCus = nameCus;
    }

    public String getNamePet() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pHId != null ? pHId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pethotel)) {
            return false;
        }
        Pethotel other = (Pethotel) object;
        if ((this.pHId == null && other.pHId != null) || (this.pHId != null && !this.pHId.equals(other.pHId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Pethotel[ pHId=" + pHId + " ]";
    }
    
}
