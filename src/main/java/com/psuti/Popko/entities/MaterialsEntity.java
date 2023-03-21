package com.psuti.Popko.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "materials", schema = "public", catalog = "Popko")
public class MaterialsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "material_type")
    private String materialType;
    @Basic
    @Column(name = "structural_element_type")
    private String structuralElementType;

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

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getStructuralElementType() {
        return structuralElementType;
    }

    public void setStructuralElementType(String structuralElementType) {
        this.structuralElementType = structuralElementType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MaterialsEntity that = (MaterialsEntity) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(materialType, that.materialType) && Objects.equals(structuralElementType, that.structuralElementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, materialType, structuralElementType);
    }
}
