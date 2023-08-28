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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "m_item_category")
@NamedQueries({
    @NamedQuery(name = "MItemCategory.findAll", query = "SELECT m FROM MItemCategory m"),
    @NamedQuery(name = "MItemCategory.findByItemCategoryId", query = "SELECT m FROM MItemCategory m WHERE m.itemCategoryId = :itemCategoryId"),
    @NamedQuery(name = "MItemCategory.findByName", query = "SELECT m FROM MItemCategory m WHERE m.name = :name"),
    @NamedQuery(name = "MItemCategory.findByDateCreated", query = "SELECT m FROM MItemCategory m WHERE m.dateCreated = :dateCreated"),
    @NamedQuery(name = "MItemCategory.findByDateDeleted", query = "SELECT m FROM MItemCategory m WHERE m.dateDeleted = :dateDeleted"),
    @NamedQuery(name = "MItemCategory.findByStatus", query = "SELECT m FROM MItemCategory m WHERE m.status = :status")})
public class MItemCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "item_category_id")
    private Integer itemCategoryId;
    @Column(name = "name")
    private String name;
    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Column(name = "date_deleted")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDeleted;
    @Column(name = "status")
    private Integer status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "itemCategoryId")
    private Collection<MItem> mItemCollection;

    public MItemCategory() {
    }

    public MItemCategory(Integer itemCategoryId) {
        this.itemCategoryId = itemCategoryId;
    }

    public Integer getItemCategoryId() {
        return itemCategoryId;
    }

    public void setItemCategoryId(Integer itemCategoryId) {
        this.itemCategoryId = itemCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateDeleted() {
        return dateDeleted;
    }

    public void setDateDeleted(Date dateDeleted) {
        this.dateDeleted = dateDeleted;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Collection<MItem> getMItemCollection() {
        return mItemCollection;
    }

    public void setMItemCollection(Collection<MItem> mItemCollection) {
        this.mItemCollection = mItemCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemCategoryId != null ? itemCategoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MItemCategory)) {
            return false;
        }
        MItemCategory other = (MItemCategory) object;
        if ((this.itemCategoryId == null && other.itemCategoryId != null) || (this.itemCategoryId != null && !this.itemCategoryId.equals(other.itemCategoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.MItemCategory[ itemCategoryId=" + itemCategoryId + " ]";
    }
    
}
