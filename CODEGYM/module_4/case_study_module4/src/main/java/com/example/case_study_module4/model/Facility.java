package com.example.case_study_module4.model;


import javax.persistence.*;

@Entity
public abstract class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFacility;
    private String nameFacility;
    private float area;
    private float cost;
    private int maxPeople;
    @ManyToOne
    @JoinColumn(name = "rent_type_id")
    private RentType rentType;

    @ManyToOne
    @JoinColumn(name = "facility_type_name")
    private FacilityType facilityType;

    public Facility() {
    }

    public Facility(int idFacility, String nameFacility, float area, float cost, int maxPeople, RentType rentType, FacilityType facilityType) {
        this.idFacility = idFacility;
        this.nameFacility = nameFacility;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
        this.facilityType = facilityType;
    }

    public String getNameFacility() {
        return nameFacility;
    }

    public void setNameFacility(String nameFacility) {
        this.nameFacility = nameFacility;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public int getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(int idFacility) {
        this.idFacility = idFacility;
    }

    public FacilityType getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(FacilityType facilityType) {
        this.facilityType = facilityType;
    }
}
