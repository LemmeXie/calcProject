package com.psuti.Popko.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "price_lists", schema = "public", catalog = "Popko")
public class PriceListsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "material_characteristics_id")
    private int materialCharacteristicsId;
    @Basic
    @Column(name = "date")
    private Date date;
    @Basic
    @Column(name = "purchase_price")
    private double purchasePrice;
    @Basic
    @Column(name = "selling_price")
    private double sellingPrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaterialCharacteristicsId() {
        return materialCharacteristicsId;
    }

    public void setMaterialCharacteristicsId(int materialCharacteristicsId) {
        this.materialCharacteristicsId = materialCharacteristicsId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PriceListsEntity that = (PriceListsEntity) o;
        return id == that.id && materialCharacteristicsId == that.materialCharacteristicsId && Double.compare(that.purchasePrice, purchasePrice) == 0 && Double.compare(that.sellingPrice, sellingPrice) == 0 && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, materialCharacteristicsId, date, purchasePrice, sellingPrice);
    }
}
