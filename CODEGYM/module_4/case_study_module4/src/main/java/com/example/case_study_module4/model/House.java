package com.example.case_study_module4.model;

import javax.persistence.Entity;

@Entity
public class House extends Facility{
    private String standardRoom;
    private String descriptionOtherConvenience;
    private int numberOfFloor;

    public House() {
    }

    public House(String standardRoom, String descriptionOtherConvenience, int numberOfFloor) {
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.numberOfFloor = numberOfFloor;
    }

    public House(int idFacility, String nameFacility, float area, float cost, int maxPeople, RentType rentType, FacilityType facilityType, String standardRoom, String descriptionOtherConvenience, int numberOfFloor) {
        super(idFacility, nameFacility, area, cost, maxPeople, rentType, facilityType);
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
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

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }
}
