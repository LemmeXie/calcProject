package com.psuti.Popko.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "measurement_units", schema = "public", catalog = "Popko")
public class MeasurementUnitsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "measurement_units_name")
    private String measurementUnitsName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMeasurementUnitsName() {
        return measurementUnitsName;
    }

    public void setMeasurementUnitsName(String measurementUnitsName) {
        this.measurementUnitsName = measurementUnitsName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeasurementUnitsEntity that = (MeasurementUnitsEntity) o;
        return id == that.id && Objects.equals(measurementUnitsName, that.measurementUnitsName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, measurementUnitsName);
    }
}
