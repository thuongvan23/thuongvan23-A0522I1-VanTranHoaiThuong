package BT.Assigment2.Model;

public class Truck extends Vehicle{
    public int tonnage;

    public Truck() {
    }

    public Truck(int id, String producedBrand, int productYear, String owner, int tonnage) {
        super(id, producedBrand, productYear, owner);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "tonnage=" + tonnage +
                '}'+super.toString();
    }
}
