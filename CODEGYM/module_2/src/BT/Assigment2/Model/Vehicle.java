package BT.Assigment2.Model;

public abstract class Vehicle {
    private int id;
    private String producedBrand;
    private int productYear;
    private String owner;

    public Vehicle(){
    }

    public Vehicle(int id, String producedBrand, int productYear, String owner) {
        this.id = id;
        this.producedBrand = producedBrand;
        this.productYear = productYear;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducedBrand() {
        return producedBrand;
    }

    public void setProducedBrand(String producedBrand) {
        this.producedBrand = producedBrand;
    }

    public int getProductYear() {
        return productYear;
    }

    public void setProductYear(int productYear) {
        this.productYear = productYear;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", producedBrand='" + producedBrand + '\'' +
                ", productYear=" + productYear +
                ", owner='" + owner + '\'' +
                '}';
    }
}
