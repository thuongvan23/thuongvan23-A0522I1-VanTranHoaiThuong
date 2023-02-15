package com.example.Model;

import java.util.Date;

public class Report {
    private String name;
    private int yob;
    private String gender;
    private String nationality;
    private String idCard;
    private String movingInfo;
    private String idVehicle;
    private int seat;
    private String dayStart;
    private String dayEnd;
    private String placesHaveHadVisitedSince14DayBefore;
    private HomeAddress homeAddress;
    private String[] signalsOfSick;
    private String[] historyContact;

    public Report() {
    }

    public Report(String name, int yob, String gender, String nationality, String idCard, String movingInfo, String idVehicle, int seat, String dayStart, String dayEnd, String placesHaveHadVisitedSince14DayBefore, HomeAddress homeAddress, String[] signalsOfSick, String[] historyContact) {
        this.name = name;
        this.yob = yob;
        this.gender = gender;
        this.nationality = nationality;
        this.idCard = idCard;
        this.movingInfo = movingInfo;
        this.idVehicle = idVehicle;
        this.seat = seat;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.placesHaveHadVisitedSince14DayBefore = placesHaveHadVisitedSince14DayBefore;
        this.homeAddress = homeAddress;
        this.signalsOfSick = signalsOfSick;
        this.historyContact = historyContact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getMovingInfo() {
        return movingInfo;
    }

    public void setMovingInfo(String movingInfo) {
        this.movingInfo = movingInfo;
    }

    public String getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(String idVehicle) {
        this.idVehicle = idVehicle;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getPlacesHaveHadVisitedSince14DayBefore() {
        return placesHaveHadVisitedSince14DayBefore;
    }

    public void setPlacesHaveHadVisitedSince14DayBefore(String placesHaveHadVisitedSince14DayBefore) {
        this.placesHaveHadVisitedSince14DayBefore = placesHaveHadVisitedSince14DayBefore;
    }

    public HomeAddress getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(HomeAddress homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String[] getSignalsOfSick() {
        return signalsOfSick;
    }

    public void setSignalsOfSick(String[] signalsOfSick) {
        this.signalsOfSick = signalsOfSick;
    }

    public String[] getHistoryContact() {
        return historyContact;
    }

    public void setHistoryContact(String[] historyContact) {
        this.historyContact = historyContact;
    }
}
