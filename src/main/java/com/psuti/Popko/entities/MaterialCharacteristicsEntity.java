package com.psuti.Popko.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "material_characteristics", schema = "public", catalog = "Popko")
public class MaterialCharacteristicsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "measurement_unit_id")
    private int measurementUnitId;
    @Basic
    @Column(name = "materials_id")
    private int materialsId;
    @Basic
    @Column(name = "length")
    private Double length;
    @Basic
    @Column(name = "width")
    private Double width;
    @Basic
    @Column(name = "thickness")
    private Double thickness;
    @Basic
    @Column(name = "volume")
    private Double volume;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMeasurementUnitId() {
        return measurementUnitId;
    }

    public void setMeasurementUnitId(int measurementUnitId) {
        this.measurementUnitId = measurementUnitId;
    }

    public int getMaterialsId() {
        return materialsId;
    }

    public void setMaterialsId(int materialsId) {
        this.materialsId = materialsId;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getThickness() {
        return thickness;
    }

    public void setThickness(Double thickness) {
        this.thickness = thickness;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MaterialCharacteristicsEntity that = (MaterialCharacteristicsEntity) o;
        return id == that.id && measurementUnitId == that.measurementUnitId && materialsId == that.materialsId && Objects.equals(name, that.name) && Objects.equals(length, that.length) && Objects.equals(width, that.width) && Objects.equals(thickness, that.thickness) && Objects.equals(volume, that.volume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, measurementUnitId, materialsId, length, width, thickness, volume);
    }
}
