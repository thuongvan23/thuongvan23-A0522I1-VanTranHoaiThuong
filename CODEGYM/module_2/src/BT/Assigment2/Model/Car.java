package BT.Assigment2.Model;

public class Car extends Vehicle{
    private int Seat;
    private String type;

    public Car() {
    }

    public Car(int id, String producedBrand, int productYear, String owner, int seat, String type) {
        super(id, producedBrand, productYear, owner);
        Seat = seat;
        this.type = type;
    }

    public int getSeat() {
        return Seat;
    }

    public void setSeat(int seat) {
        Seat = seat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Seat=" + Seat +
                ", type='" + type + '\'' +
                '}' + super.toString();
    }
}
