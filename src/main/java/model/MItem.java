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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "m_item")
@NamedQueries({
    @NamedQuery(name = "MItem.findAll", query = "SELECT m FROM MItem m"),
    @NamedQuery(name = "MItem.findByItemId", query = "SELECT m FROM MItem m WHERE m.itemId = :itemId"),
    @NamedQuery(name = "MItem.findByBarcode", query = "SELECT m FROM MItem m WHERE m.barcode = :barcode"),
    @NamedQuery(name = "MItem.findByItemCode", query = "SELECT m FROM MItem m WHERE m.itemCode = :itemCode"),
    @NamedQuery(name = "MItem.findByName", query = "SELECT m FROM MItem m WHERE m.name = :name"),
    @NamedQuery(name = "MItem.findByReOrderLevel", query = "SELECT m FROM MItem m WHERE m.reOrderLevel = :reOrderLevel"),
    @NamedQuery(name = "MItem.findByIsExpiryItem", query = "SELECT m FROM MItem m WHERE m.isExpiryItem = :isExpiryItem"),
    @NamedQuery(name = "MItem.findByExpiryNotifyDays", query = "SELECT m FROM MItem m WHERE m.expiryNotifyDays = :expiryNotifyDays"),
    @NamedQuery(name = "MItem.findByIsBarcodePrint", query = "SELECT m FROM MItem m WHERE m.isBarcodePrint = :isBarcodePrint"),
    @NamedQuery(name = "MItem.findByImage", query = "SELECT m FROM MItem m WHERE m.image = :image"),
    @NamedQuery(name = "MItem.findByRackNumber", query = "SELECT m FROM MItem m WHERE m.rackNumber = :rackNumber"),
    @NamedQuery(name = "MItem.findByBayNumber", query = "SELECT m FROM MItem m WHERE m.bayNumber = :bayNumber"),
    @NamedQuery(name = "MItem.findByShelfNumber", query = "SELECT m FROM MItem m WHERE m.shelfNumber = :shelfNumber"),
    @NamedQuery(name = "MItem.findByStatus", query = "SELECT m FROM MItem m WHERE m.status = :status"),
    @NamedQuery(name = "MItem.findByIsSynced", query = "SELECT m FROM MItem m WHERE m.isSynced = :isSynced"),
    @NamedQuery(name = "MItem.findByDateCreated", query = "SELECT m FROM MItem m WHERE m.dateCreated = :dateCreated"),
    @NamedQuery(name = "MItem.findByDateDeleted", query = "SELECT m FROM MItem m WHERE m.dateDeleted = :dateDeleted")})
public class MItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "item_id")
    private Integer itemId;
    @Column(name = "barcode")
    private String barcode;
    @Column(name = "item_code")
    private String itemCode;
    @Column(name = "name")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "re_order_level")
    private Double reOrderLevel;
    @Column(name = "is_expiry_item")
    private Short isExpiryItem;
    @Column(name = "expiry_notify_days")
    private Integer expiryNotifyDays;
    @Column(name = "is_barcode_print")
    private Short isBarcodePrint;
    @Column(name = "image")
    private String image;
    @Column(name = "rack_number")
    private Integer rackNumber;
    @Column(name = "bay_number")
    private Integer bayNumber;
    @Column(name = "shelf_number")
    private Integer shelfNumber;
    @Column(name = "status")
    private Integer status;
    @Column(name = "is_synced")
    private Short isSynced;
    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Column(name = "date_deleted")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDeleted;
    @JoinColumn(name = "item_category_id", referencedColumnName = "item_category_id")
    @ManyToOne(optional = false)
    private MItemCategory itemCategoryId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mItemItemId")
    private Collection<Sku> skuCollection;

    public MItem() {
    }

    public MItem(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getReOrderLevel() {
        return reOrderLevel;
    }

    public void setReOrderLevel(Double reOrderLevel) {
        this.reOrderLevel = reOrderLevel;
    }

    public Short getIsExpiryItem() {
        return isExpiryItem;
    }

    public void setIsExpiryItem(Short isExpiryItem) {
        this.isExpiryItem = isExpiryItem;
    }

    public Integer getExpiryNotifyDays() {
        return expiryNotifyDays;
    }

    public void setExpiryNotifyDays(Integer expiryNotifyDays) {
        this.expiryNotifyDays = expiryNotifyDays;
    }

    public Short getIsBarcodePrint() {
        return isBarcodePrint;
    }

    public void setIsBarcodePrint(Short isBarcodePrint) {
        this.isBarcodePrint = isBarcodePrint;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getRackNumber() {
        return rackNumber;
    }

    public void setRackNumber(Integer rackNumber) {
        this.rackNumber = rackNumber;
    }

    public Integer getBayNumber() {
        return bayNumber;
    }

    public void setBayNumber(Integer bayNumber) {
        this.bayNumber = bayNumber;
    }

    public Integer getShelfNumber() {
        return shelfNumber;
    }

    public void setShelfNumber(Integer shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Short getIsSynced() {
        return isSynced;
    }

    public void setIsSynced(Short isSynced) {
        this.isSynced = isSynced;
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

    public MItemCategory getItemCategoryId() {
        return itemCategoryId;
    }

    public void setItemCategoryId(MItemCategory itemCategoryId) {
        this.itemCategoryId = itemCategoryId;
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
        hash += (itemId != null ? itemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MItem)) {
            return false;
        }
        MItem other = (MItem) object;
        if ((this.itemId == null && other.itemId != null) || (this.itemId != null && !this.itemId.equals(other.itemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.MItem[ itemId=" + itemId + " ]";
    }
    
}
