package BT;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    Circle (double radius){
        this.radius = radius;
    }
    Circle(){};

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return 3.14*radius*radius;
    }
}
