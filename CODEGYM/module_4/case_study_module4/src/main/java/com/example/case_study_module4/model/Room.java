package com.example.case_study_module4.model;

import javax.persistence.Entity;

@Entity
public class Room extends Facility{
    private String facilityFree;

    public Room() {
    }

    public Room(String facilityFree) {
        this.facilityFree = facilityFree;
    }

    public Room(int idFacility, String nameFacility, float area, float cost, int maxPeople, RentType rentType, FacilityType facilityType, String facilityFree) {
        super(idFacility, nameFacility, area, cost, maxPeople, rentType, facilityType);
        this.facilityFree = facilityFree;
    }

    public String getFacilityFree() {
        return facilityFree;
    }

    public void setFacilityFree(String facilityFree) {
        this.facilityFree = facilityFree;
    }
}
