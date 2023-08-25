///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package model;
//
//import java.io.Serializable;
//import java.util.Date;
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//
///**
// *
// * @author VS
// */
//@Entity
//@Table(name = "item_color")
//@NamedQueries({
//    @NamedQuery(name = "ItemColor.findAll", query = "SELECT i FROM ItemColor i"),
//    @NamedQuery(name = "ItemColor.findByItemColorId", query = "SELECT i FROM ItemColor i WHERE i.itemColorId = :itemColorId"),
//    @NamedQuery(name = "ItemColor.findByName", query = "SELECT i FROM ItemColor i WHERE i.name = :name"),
//    @NamedQuery(name = "ItemColor.findByStatus", query = "SELECT i FROM ItemColor i WHERE i.status = :status"),
//    @NamedQuery(name = "ItemColor.findByDateCreated", query = "SELECT i FROM ItemColor i WHERE i.dateCreated = :dateCreated")})
//public class ItemColor implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Id
//    @Basic(optional = false)
//    @Column(name = "item_color_id")
//    private Integer itemColorId;
//    @Column(name = "name")
//    private String name;
//    @Column(name = "status")
//    private Integer status;
//    @Column(name = "date_created")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date dateCreated;
//
//    public ItemColor() {
//    }
//
//    public ItemColor(Integer itemColorId) {
//        this.itemColorId = itemColorId;
//    }
//
//    public Integer getItemColorId() {
//        return itemColorId;
//    }
//
//    public void setItemColorId(Integer itemColorId) {
//        this.itemColorId = itemColorId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getStatus() {
//        return status;
//    }
//
//    public void setStatus(Integer status) {
//        this.status = status;
//    }
//
//    public Date getDateCreated() {
//        return dateCreated;
//    }
//
//    public void setDateCreated(Date dateCreated) {
//        this.dateCreated = dateCreated;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (itemColorId != null ? itemColorId.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof ItemColor)) {
//            return false;
//        }
//        ItemColor other = (ItemColor) object;
//        if ((this.itemColorId == null && other.itemColorId != null) || (this.itemColorId != null && !this.itemColorId.equals(other.itemColorId))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "model.ItemColor[ itemColorId=" + itemColorId + " ]";
//    }
//    
//}
