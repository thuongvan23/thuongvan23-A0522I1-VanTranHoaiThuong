package Model;

public class Payment {
    private int id;
    private String howToPay;

    public Payment() {
    }

    public Payment(int id, String howToPay) {
        this.id = id;
        this.howToPay = howToPay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHowToPay() {
        return howToPay;
    }

    public void setHowToPay(String howToPay) {
        this.howToPay = howToPay;
    }
}
