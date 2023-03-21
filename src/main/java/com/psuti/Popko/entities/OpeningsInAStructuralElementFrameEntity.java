package com.psuti.Popko.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "openings_in_a_structural_element_frame", schema = "public", catalog = "Popko")
public class OpeningsInAStructuralElementFrameEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "structural_element_frame_id")
    private long structuralElementFrameId;
    @Basic
    @Column(name = "openings_id")
    private long openingsId;
    @Basic
    @Column(name = "amount")
    private Integer amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getStructuralElementFrameId() {
        return structuralElementFrameId;
    }

    public void setStructuralElementFrameId(long structuralElementFrameId) {
        this.structuralElementFrameId = structuralElementFrameId;
    }

    public long getOpeningsId() {
        return openingsId;
    }

    public void setOpeningsId(long openingsId) {
        this.openingsId = openingsId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OpeningsInAStructuralElementFrameEntity that = (OpeningsInAStructuralElementFrameEntity) o;
        return id == that.id && structuralElementFrameId == that.structuralElementFrameId && openingsId == that.openingsId && Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, structuralElementFrameId, openingsId, amount);
    }
}
