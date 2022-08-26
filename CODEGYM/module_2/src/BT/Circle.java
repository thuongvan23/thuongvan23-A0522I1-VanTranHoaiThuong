package BT;

public class Circle {
    public double radius;
    public String color;
    Circle (double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
    }

    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea() {
        return 3.14*radius*radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                "Area: "+ this.getArea() +
                '}';
    }
}
