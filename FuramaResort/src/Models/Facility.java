package Models;

import java.util.Objects;

public abstract class Facility {
    private String serviceName;
    private float usingArea;
    private int price;
    private int people;
    private String howToRent;

    public Facility() {
    }

    public Facility(String serviceName, float usingArea, int price, int people, String howToRent) {
        this.serviceName = serviceName;
        this.usingArea = usingArea;
        this.price = price;
        this.people = people;
        this.howToRent = howToRent;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public float getUsingArea() {
        return usingArea;
    }

    public void setUsingArea(float usingArea) {
        this.usingArea = usingArea;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getHowToRent() {
        return howToRent;
    }

    public void setHowToRent(String howToRent) {
        this.howToRent = howToRent;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", usingArea=" + usingArea +
                ", price=" + price +
                ", people=" + people +
                ", howToRent='" + howToRent + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Float.compare(facility.usingArea, usingArea) == 0 && price == facility.price && people == facility.people && Objects.equals(serviceName, facility.serviceName) && Objects.equals(howToRent, facility.howToRent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceName, usingArea, price, people, howToRent);
    }
}
