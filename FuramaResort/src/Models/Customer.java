package Models;

public class Customer extends Person{
    private int customerId;
    private String levelCustomer;
    private String address;

    public Customer() {
    }

    public Customer(int customerId, String levelCustomer, String address) {
        this.customerId = customerId;
        this.levelCustomer = levelCustomer;
        this.address = address;
    }

    public Customer(String name, String birthday, String gender, String identifyId, String phoneNumber, String email, int customerId, String levelCustomer, String address) {
        super(name, birthday, gender, identifyId, phoneNumber, email);
        this.customerId = customerId;
        this.levelCustomer = levelCustomer;
        this.address = address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getLevelCustomer() {
        return levelCustomer;
    }

    public void setLevelCustomer(String levelCustomer) {
        this.levelCustomer = levelCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", levelCustomer=" + levelCustomer +
                ", address='" + address + '\'' +
                '}'+super.toString();
    }
}
