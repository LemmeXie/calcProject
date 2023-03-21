package com.psuti.Popko.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "openings", schema = "public", catalog = "Popko")
public class OpeningsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "type")
    private String type;
    @Basic
    @Column(name = "width")
    private double width;
    @Basic
    @Column(name = "height")
    private double height;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OpeningsEntity that = (OpeningsEntity) o;
        return id == that.id && Double.compare(that.width, width) == 0 && Double.compare(that.height, height) == 0 && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, width, height);
    }
}
