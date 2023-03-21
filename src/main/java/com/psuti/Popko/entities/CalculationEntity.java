package com.psuti.Popko.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "calculation", schema = "public", catalog = "Popko")
public class CalculationEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "manager_id")
    private long managerId;
    @Basic
    @Column(name = "address_object_constructions")
    private String addressObjectConstructions;
    @Basic
    @Column(name = "number")
    private long number;
    @Basic
    @Column(name = "created_date")
    private Date createdDate;
    @Basic
    @Column(name = "results_id")
    private long resultsId;
    @Basic
    @Column(name = "calculation_state_id")
    private long calculationStateId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getManagerId() {
        return managerId;
    }

    public void setManagerId(long managerId) {
        this.managerId = managerId;
    }

    public String getAddressObjectConstructions() {
        return addressObjectConstructions;
    }

    public void setAddressObjectConstructions(String addressObjectConstructions) {
        this.addressObjectConstructions = addressObjectConstructions;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public long getResultsId() {
        return resultsId;
    }

    public void setResultsId(long resultsId) {
        this.resultsId = resultsId;
    }

    public long getCalculationStateId() {
        return calculationStateId;
    }

    public void setCalculationStateId(long calculationStateId) {
        this.calculationStateId = calculationStateId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculationEntity that = (CalculationEntity) o;
        return id == that.id && managerId == that.managerId && number == that.number && resultsId == that.resultsId && calculationStateId == that.calculationStateId && Objects.equals(addressObjectConstructions, that.addressObjectConstructions) && Objects.equals(createdDate, that.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, managerId, addressObjectConstructions, number, createdDate, resultsId, calculationStateId);
    }
}
