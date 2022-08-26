package BT;

public class Cylinder extends Circle{
    public double h;
    Cylinder (double h, double radius, String color){
        this.h = h;
        getRadius();
        getColor();
    }
    public double getH(){
        return h;
    }

    public double getVolume(){
        return this.getArea()*this.getH();
    }
    public String toString() {
        return "Cylinder{" +
                "radius=" + Circle.getRadius +
                ", color='" + color + '\'' +
                "h=" + h + "Volume:" + this.getVolume()+
                '}';
    }
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.0,1.0, "blue");
        System.out.println(cylinder.toString());
    }
}
