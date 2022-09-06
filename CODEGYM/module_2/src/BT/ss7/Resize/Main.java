package BT.ss7.Resize;

public class Main {
    public static void main(String[] args) {
        double percent = Math.random();
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5, "blue", true);
        shapes[1] = new Rectangle(5, 10, "red", true);
        shapes[2] = new Square(7, "yellow", true);
        System.out.println("Before: ");
        for (Shape a : shapes) {
            System.out.println(a.getArea());
        }
        System.out.println("After: ");
        for (Shape a: shapes) {
            double newArea = a.getArea() * percent;
            System.out.println(newArea);
        }
    }
}
