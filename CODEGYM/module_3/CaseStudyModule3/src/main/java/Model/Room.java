package Model;

public class Room extends RentingService{
    private String freeServiceIncluded;

    public Room(){
    }

    public Room(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String serviceId, String serviceName, int serviceArea, double serviceCost, int serviceMaxPeople, String freeServiceIncluded) {
        super(serviceId, serviceName, serviceArea, serviceCost, serviceMaxPeople);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }
}
