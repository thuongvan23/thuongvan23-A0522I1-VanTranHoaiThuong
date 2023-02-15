package BT.Assigment2.Model;

public class MotoBike extends Vehicle{
    private int pressure;

    public MotoBike() {
    }

    public MotoBike(int id, String producedBrand, int productYear, String owner, int pressure) {
        super(id, producedBrand, productYear, owner);
        this.pressure = pressure;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "MotoBike{" +
                "pressure=" + pressure +
                '}'+super.toString();
    }

}
