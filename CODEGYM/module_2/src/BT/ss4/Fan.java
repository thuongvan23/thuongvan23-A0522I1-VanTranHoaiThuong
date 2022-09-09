package BT.ss4;

public class Fan {
    private static final byte SLOW = 1;
    private static final byte MEDIUM = 2;
    private static final byte FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    Fan (int speed, boolean on, double radius, String color){
        this.speed=speed;
        this.on=on;
        this.radius=radius;
        this.color=color;
    }
    private int getSpeed(){
        return  speed;
    }
    private boolean getOn(){
        return on;
    }
    private double getRadius(){
        return radius;
    }
    private String getColor(){
        return color;
    }
    public String toString(){
        String state="";
        if(this.on){
            state= "Speed: "+this.speed +"; Color: "+this.color+"; Radius: "+this.radius+ " Fan is on";
        } else {
            state= "Speed: "+this.speed +"; Color: "+this.color+"; Radius: "+this.radius+ " Fan is off";
        }
        return state;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(2, true, 7, "red");
        Fan fan2 = new Fan(3, false, 8, "yellow");

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
