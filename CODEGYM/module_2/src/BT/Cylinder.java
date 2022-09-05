package BT;

public class Cylinder extends Circle {
    public double h;

    Cylinder(double h, double radius, String color) {
        super(radius, color);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public double getVolume() {
        return super.getArea() * this.getH();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "h=" + h +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.0, 2.0, "blue");
        System.out.println(cylinder.toString());
        System.out.println(cylinder.getVolume());
    }
}
