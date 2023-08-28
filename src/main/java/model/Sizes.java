/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author VS
 */
@Entity
@Table(name = "sizes")
@NamedQueries({
    @NamedQuery(name = "Sizes.findAll", query = "SELECT s FROM Sizes s"),
    @NamedQuery(name = "Sizes.findBySizeId", query = "SELECT s FROM Sizes s WHERE s.sizeId = :sizeId"),
    @NamedQuery(name = "Sizes.findByName", query = "SELECT s FROM Sizes s WHERE s.name = :name"),
    @NamedQuery(name = "Sizes.findByStatus", query = "SELECT s FROM Sizes s WHERE s.status = :status"),
    @NamedQuery(name = "Sizes.findByDateCreated", query = "SELECT s FROM Sizes s WHERE s.dateCreated = :dateCreated")})
public class Sizes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "size_id")
    private Integer sizeId;
    @Column(name = "name")
    private String name;
    @Column(name = "status")
    private Integer status;
    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sizesSizeId")
    private Collection<Sku> skuCollection;

    public Sizes() {
    }

    public Sizes(Integer sizeId) {
        this.sizeId = sizeId;
    }

    public Integer getSizeId() {
        return sizeId;
    }

    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Collection<Sku> getSkuCollection() {
        return skuCollection;
    }

    public void setSkuCollection(Collection<Sku> skuCollection) {
        this.skuCollection = skuCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sizeId != null ? sizeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sizes)) {
            return false;
        }
        Sizes other = (Sizes) object;
        if ((this.sizeId == null && other.sizeId != null) || (this.sizeId != null && !this.sizeId.equals(other.sizeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Sizes[ sizeId=" + sizeId + " ]";
    }
    
}
