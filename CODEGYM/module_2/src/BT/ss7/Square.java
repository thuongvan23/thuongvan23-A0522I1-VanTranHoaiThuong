package BT.ss7;

public class Square extends Shape implements Resizeable{
    private double a;

    public Square(){
    }

    public Square(double a){
        this.a = a;
    }

    public Square(double a, String color, boolean filled){
        super(color, filled);
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    @Override
    public double getArea(){
        return Math.sqrt(a);
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}'+
                super.toString();
    }

    @Override
    public void resize(double percent) {
        this.a = a*percent;
    }
}
