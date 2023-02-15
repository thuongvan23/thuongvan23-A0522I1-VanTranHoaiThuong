package BT.Assigment2.Model;

public class Brand {
    private int ID;
    private String name;
    private String country;

    public Brand() {
    }

    public Brand(int ID, String name, String country) {
        this.ID = ID;
        this.name = name;
        this.country = country;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "ProducedBrand{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
