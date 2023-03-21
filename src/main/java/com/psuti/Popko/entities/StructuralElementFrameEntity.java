package com.psuti.Popko.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "structural_element_frame", schema = "public", catalog = "Popko")
public class StructuralElementFrameEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "results_id")
    private int resultsId;
    @Basic
    @Column(name = "amount_floor")
    private int amountFloor;
    @Basic
    @Column(name = "floor_number")
    private int floorNumber;
    @Basic
    @Column(name = "floor_height")
    private int floorHeight;
    @Basic
    @Column(name = "perimeter_of_external_walls")
    private double perimeterOfExternalWalls;
    @Basic
    @Column(name = "base_area")
    private double baseArea;
    @Basic
    @Column(name = "external_wall_thickness")
    private double externalWallThickness;
    @Basic
    @Column(name = "internal_wall_length")
    private int internalWallLength;
    @Basic
    @Column(name = "internal_wall_thickness")
    private int internalWallThickness;
    @Basic
    @Column(name = "osb_external_wall")
    private String osbExternalWall;
    @Basic
    @Column(name = "steam_waterproofing_external_wall")
    private String steamWaterproofingExternalWall;
    @Basic
    @Column(name = "windscreen_external_wall")
    private String windscreenExternalWall;
    @Basic
    @Column(name = "insulation_external_wall")
    private String insulationExternalWall;
    @Basic
    @Column(name = "overlap_thickness")
    private String overlapThickness;
    @Basic
    @Column(name = "osb_thickness")
    private String osbThickness;
    @Basic
    @Column(name = "steam_waterproofing_thickness")
    private String steamWaterproofingThickness;
    @Basic
    @Column(name = "windscreen_thickness")
    private String windscreenThickness;
    @Basic
    @Column(name = "insulation_thickness")
    private String insulationThickness;
    @Basic
    @Column(name = "osb_internal_wal")
    private String osbInternalWal;

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

    public int getAmountFloor() {
        return amountFloor;
    }

    public void setAmountFloor(int amountFloor) {
        this.amountFloor = amountFloor;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getFloorHeight() {
        return floorHeight;
    }

    public void setFloorHeight(int floorHeight) {
        this.floorHeight = floorHeight;
    }

    public double getPerimeterOfExternalWalls() {
        return perimeterOfExternalWalls;
    }

    public void setPerimeterOfExternalWalls(double perimeterOfExternalWalls) {
        this.perimeterOfExternalWalls = perimeterOfExternalWalls;
    }

    public double getBaseArea() {
        return baseArea;
    }

    public void setBaseArea(double baseArea) {
        this.baseArea = baseArea;
    }

    public double getExternalWallThickness() {
        return externalWallThickness;
    }

    public void setExternalWallThickness(double externalWallThickness) {
        this.externalWallThickness = externalWallThickness;
    }

    public int getInternalWallLength() {
        return internalWallLength;
    }

    public void setInternalWallLength(int internalWallLength) {
        this.internalWallLength = internalWallLength;
    }

    public int getInternalWallThickness() {
        return internalWallThickness;
    }

    public void setInternalWallThickness(int internalWallThickness) {
        this.internalWallThickness = internalWallThickness;
    }

    public String getOsbExternalWall() {
        return osbExternalWall;
    }

    public void setOsbExternalWall(String osbExternalWall) {
        this.osbExternalWall = osbExternalWall;
    }

    public String getSteamWaterproofingExternalWall() {
        return steamWaterproofingExternalWall;
    }

    public void setSteamWaterproofingExternalWall(String steamWaterproofingExternalWall) {
        this.steamWaterproofingExternalWall = steamWaterproofingExternalWall;
    }

    public String getWindscreenExternalWall() {
        return windscreenExternalWall;
    }

    public void setWindscreenExternalWall(String windscreenExternalWall) {
        this.windscreenExternalWall = windscreenExternalWall;
    }

    public String getInsulationExternalWall() {
        return insulationExternalWall;
    }

    public void setInsulationExternalWall(String insulationExternalWall) {
        this.insulationExternalWall = insulationExternalWall;
    }

    public String getOverlapThickness() {
        return overlapThickness;
    }

    public void setOverlapThickness(String overlapThickness) {
        this.overlapThickness = overlapThickness;
    }

    public String getOsbThickness() {
        return osbThickness;
    }

    public void setOsbThickness(String osbThickness) {
        this.osbThickness = osbThickness;
    }

    public String getSteamWaterproofingThickness() {
        return steamWaterproofingThickness;
    }

    public void setSteamWaterproofingThickness(String steamWaterproofingThickness) {
        this.steamWaterproofingThickness = steamWaterproofingThickness;
    }

    public String getWindscreenThickness() {
        return windscreenThickness;
    }

    public void setWindscreenThickness(String windscreenThickness) {
        this.windscreenThickness = windscreenThickness;
    }

    public String getInsulationThickness() {
        return insulationThickness;
    }

    public void setInsulationThickness(String insulationThickness) {
        this.insulationThickness = insulationThickness;
    }

    public String getOsbInternalWal() {
        return osbInternalWal;
    }

    public void setOsbInternalWal(String osbInternalWal) {
        this.osbInternalWal = osbInternalWal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StructuralElementFrameEntity that = (StructuralElementFrameEntity) o;
        return id == that.id && resultsId == that.resultsId && amountFloor == that.amountFloor && floorNumber == that.floorNumber && floorHeight == that.floorHeight && Double.compare(that.perimeterOfExternalWalls, perimeterOfExternalWalls) == 0 && Double.compare(that.baseArea, baseArea) == 0 && Double.compare(that.externalWallThickness, externalWallThickness) == 0 && internalWallLength == that.internalWallLength && internalWallThickness == that.internalWallThickness && Objects.equals(osbExternalWall, that.osbExternalWall) && Objects.equals(steamWaterproofingExternalWall, that.steamWaterproofingExternalWall) && Objects.equals(windscreenExternalWall, that.windscreenExternalWall) && Objects.equals(insulationExternalWall, that.insulationExternalWall) && Objects.equals(overlapThickness, that.overlapThickness) && Objects.equals(osbThickness, that.osbThickness) && Objects.equals(steamWaterproofingThickness, that.steamWaterproofingThickness) && Objects.equals(windscreenThickness, that.windscreenThickness) && Objects.equals(insulationThickness, that.insulationThickness) && Objects.equals(osbInternalWal, that.osbInternalWal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, resultsId, amountFloor, floorNumber, floorHeight, perimeterOfExternalWalls, baseArea, externalWallThickness, internalWallLength, internalWallThickness, osbExternalWall, steamWaterproofingExternalWall, windscreenExternalWall, insulationExternalWall, overlapThickness, osbThickness, steamWaterproofingThickness, windscreenThickness, insulationThickness, osbInternalWal);
    }
}
