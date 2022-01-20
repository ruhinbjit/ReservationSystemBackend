package com.example.ReservationSystemBackend.entity;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "aircraft_type")
public class AirCraftType extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type", nullable = false)
    @NotEmpty(message = "type name must not be empty")
    @Size(min = 2, max = 20, message = "type must be at least 2 characters")
    private String type;

    @Column(name = "man_weight")
    private String manWeight;

    @Column(name = "women_weight")
    private String womenWeight;
    @Column(name = "child_weight")
    private String childWeight;
    @Column(name = "infant_weight")
    private String infantWeight;



    public AirCraftType() {}

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getManWeight() {
        return manWeight;
    }

    public String getWomenWeight() {
        return womenWeight;
    }

    public String getChildWeight() {
        return childWeight;
    }

    public String getInfantWeight() {
        return infantWeight;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setManWeight(String manWeight) {
        this.manWeight = manWeight;
    }

    public void setWomenWeight(String womenWeight) {
        this.womenWeight = womenWeight;
    }

    public void setChildWeight(String childWeight) {
        this.childWeight = childWeight;
    }

    @Override
    public String toString() {
        return "AirCraftType{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", manWeight='" + manWeight + '\'' +
                ", womenWeight='" + womenWeight + '\'' +
                ", childWeight='" + childWeight + '\'' +
                ", infantWeight='" + infantWeight + '\'' +
                '}';
    }

    public AirCraftType(String type, String manWeight, String womenWeight, String childWeight, String infantWeight) {
        this.type = type;
        this.manWeight = manWeight;
        this.womenWeight = womenWeight;
        this.childWeight = childWeight;
        this.infantWeight = infantWeight;
    }

    public void setInfantWeight(String infantWeight) {
        this.infantWeight = infantWeight;
    }
}
