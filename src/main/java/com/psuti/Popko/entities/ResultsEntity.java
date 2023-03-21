package com.psuti.Popko.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "results", schema = "public", catalog = "Popko")
public class ResultsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "material_characteristics_id")
    private long materialCharacteristicsId;
    @Basic
    @Column(name = "material")
    private String material;
    @Basic
    @Column(name = "amount")
    private Integer amount;
    @Basic
    @Column(name = "price")
    private Double price;
    @Basic
    @Column(name = "measurement_unit")
    private String measurementUnit;
    @Basic
    @Column(name = "full_price")
    private Double fullPrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getMaterialCharacteristicsId() {
        return materialCharacteristicsId;
    }

    public void setMaterialCharacteristicsId(long materialCharacteristicsId) {
        this.materialCharacteristicsId = materialCharacteristicsId;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    public Double getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(Double fullPrice) {
        this.fullPrice = fullPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultsEntity that = (ResultsEntity) o;
        return id == that.id && materialCharacteristicsId == that.materialCharacteristicsId && Objects.equals(material, that.material) && Objects.equals(amount, that.amount) && Objects.equals(price, that.price) && Objects.equals(measurementUnit, that.measurementUnit) && Objects.equals(fullPrice, that.fullPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, materialCharacteristicsId, material, amount, price, measurementUnit, fullPrice);
    }
}
