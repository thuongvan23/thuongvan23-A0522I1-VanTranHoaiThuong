package BT.ss5;

import BT.ss6.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0, "blue");
        System.out.println("Radius: "+circle.getRadius());
        System.out.println("Area: " +circle.getArea());
        System.out.println("Color: "+circle.getColor());
    }
}
