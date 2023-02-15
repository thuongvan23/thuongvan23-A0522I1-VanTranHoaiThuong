package Model;

public class Villa extends RentingService{
    private String standardRoom;
    private String descriptionOtherConvenience;
    private double poolArea;
    private int numberOfFloors;

    public Villa(){
    }

    public Villa(String standardRoom, String descriptionOtherConvenience, double poolArea, int numberOfFloors) {
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String serviceId ,String serviceName, int serviceArea, double serviceCost, int serviceMaxPeople, String standardRoom, String descriptionOtherConvenience, double poolArea, int numberOfFloors) {
        super(serviceId, serviceName, serviceArea, serviceCost, serviceMaxPeople);
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
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

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
