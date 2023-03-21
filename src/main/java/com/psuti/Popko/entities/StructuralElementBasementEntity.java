package com.psuti.Popko.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "structural_element_basement", schema = "public", catalog = "Popko")
public class StructuralElementBasementEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "results_id")
    private int resultsId;
    @Basic
    @Column(name = "perimeter_of_external_walls")
    private double perimeterOfExternalWalls;
    @Basic
    @Column(name = "internal_wall_length")
    private double internalWallLength;
    @Basic
    @Column(name = "concrete_piles")
    private String concretePiles;
    @Basic
    @Column(name = "concrete")
    private String concrete;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getResultsId() {
        return resultsId;
    }

    public void setResultsId(int resultsId) {
        this.resultsId = resultsId;
    }

    public double getPerimeterOfExternalWalls() {
        return perimeterOfExternalWalls;
    }

    public void setPerimeterOfExternalWalls(double perimeterOfExternalWalls) {
        this.perimeterOfExternalWalls = perimeterOfExternalWalls;
    }

    public double getInternalWallLength() {
        return internalWallLength;
    }

    public void setInternalWallLength(double internalWallLength) {
        this.internalWallLength = internalWallLength;
    }

    public String getConcretePiles() {
        return concretePiles;
    }

    public void setConcretePiles(String concretePiles) {
        this.concretePiles = concretePiles;
    }

    public String getConcrete() {
        return concrete;
    }

    public void setConcrete(String concrete) {
        this.concrete = concrete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StructuralElementBasementEntity that = (StructuralElementBasementEntity) o;
        return id == that.id && resultsId == that.resultsId && Double.compare(that.perimeterOfExternalWalls, perimeterOfExternalWalls) == 0 && Double.compare(that.internalWallLength, internalWallLength) == 0 && Objects.equals(concretePiles, that.concretePiles) && Objects.equals(concrete, that.concrete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, resultsId, perimeterOfExternalWalls, internalWallLength, concretePiles, concrete);
    }
}
