/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 *
 * @author VS
 */
@Entity
@Table(name = "sku")
@NamedQueries({
    @NamedQuery(name = "Sku.findAll", query = "SELECT s FROM Sku s"),
    @NamedQuery(name = "Sku.findBySkuId", query = "SELECT s FROM Sku s WHERE s.skuId = :skuId"),
    @NamedQuery(name = "Sku.findByStock", query = "SELECT s FROM Sku s WHERE s.stock = :stock")})
public class Sku implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sku_id")
    private Integer skuId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "stock")
    private Double stock;
    @JoinColumn(name = "item_color_item_color_id", referencedColumnName = "item_color_id")
    @ManyToOne(optional = false)
    private ItemColor itemColorItemColorId;
    @JoinColumn(name = "m_item_item_id", referencedColumnName = "item_id")
    @ManyToOne(optional = false)
    private MItem mItemItemId;
    @JoinColumn(name = "sizes_size_id", referencedColumnName = "size_id")
    @ManyToOne(optional = false)
    private Sizes sizesSizeId;
    @JoinColumn(name = "unit_unit_id", referencedColumnName = "unit_id")
    @ManyToOne(optional = false)
    private Unit unitUnitId;

    public Sku() {
    }

    public Sku(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }

    public ItemColor getItemColorItemColorId() {
        return itemColorItemColorId;
    }

    public void setItemColorItemColorId(ItemColor itemColorItemColorId) {
        this.itemColorItemColorId = itemColorItemColorId;
    }

    public MItem getMItemItemId() {
        return mItemItemId;
    }

    public void setMItemItemId(MItem mItemItemId) {
        this.mItemItemId = mItemItemId;
    }

    public Sizes getSizesSizeId() {
        return sizesSizeId;
    }

    public void setSizesSizeId(Sizes sizesSizeId) {
        this.sizesSizeId = sizesSizeId;
    }

    public Unit getUnitUnitId() {
        return unitUnitId;
    }

    public void setUnitUnitId(Unit unitUnitId) {
        this.unitUnitId = unitUnitId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (skuId != null ? skuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sku)) {
            return false;
        }
        Sku other = (Sku) object;
        if ((this.skuId == null && other.skuId != null) || (this.skuId != null && !this.skuId.equals(other.skuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Sku[ skuId=" + skuId + " ]";
    }
    
}
