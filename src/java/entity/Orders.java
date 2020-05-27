/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author NGUYEN HOANG BAO
 */
@Entity
@Table(name = "orders", catalog = "Project_HK4_PetShop", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orders.findAll", query = "SELECT o FROM Orders o"),
    @NamedQuery(name = "Orders.findByOderId", query = "SELECT o FROM Orders o WHERE o.oderId = :oderId"),
    @NamedQuery(name = "Orders.findByTotal", query = "SELECT o FROM Orders o WHERE o.total = :total"),
    @NamedQuery(name = "Orders.findByShipAddress", query = "SELECT o FROM Orders o WHERE o.shipAddress = :shipAddress"),
    @NamedQuery(name = "Orders.findByOderDate", query = "SELECT o FROM Orders o WHERE o.oderDate = :oderDate")})
public class Orders implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "oderId", nullable = false)
    private Integer oderId;
    @Column(name = "total")
    private Integer total;
    @Size(max = 50)
    @Column(name = "shipAddress", length = 50)
    private String shipAddress;
    @Column(name = "oderDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date oderDate;
    @OneToMany(mappedBy = "oderId")
    private Collection<OdersDetails> odersDetailsCollection;

    public Orders() {
    }

    public Orders(Integer oderId) {
        this.oderId = oderId;
    }

    public Integer getOderId() {
        return oderId;
    }

    public void setOderId(Integer oderId) {
        this.oderId = oderId;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public Date getOderDate() {
        return oderDate;
    }

    public void setOderDate(Date oderDate) {
        this.oderDate = oderDate;
    }

    @XmlTransient
    public Collection<OdersDetails> getOdersDetailsCollection() {
        return odersDetailsCollection;
    }

    public void setOdersDetailsCollection(Collection<OdersDetails> odersDetailsCollection) {
        this.odersDetailsCollection = odersDetailsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oderId != null ? oderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.oderId == null && other.oderId != null) || (this.oderId != null && !this.oderId.equals(other.oderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Orders[ oderId=" + oderId + " ]";
    }
    
}
