package com.example.case_study_module4.model;

import javax.persistence.Entity;

@Entity
public class Villa extends Facility{
    private String standardRoom;
    private String descriptionOtherConvenience;
    private float poolArea;
    private int numberOfFloor;

    public Villa() {
    }

    public Villa(String standardRoom, String descriptionOtherConvenience, float poolArea, int numberOfFloor) {
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa(int idFacility, String nameFacility, float area, float cost, int maxPeople, RentType rentType, FacilityType facilityType, String standardRoom, String descriptionOtherConvenience, float poolArea, int numberOfFloor) {
        super(idFacility, nameFacility, area, cost, maxPeople, rentType, facilityType);
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }
}
