package BT;

import java.util.Arrays;

public class MovingPoint extends Point2D{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovingPoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovingPoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovingPoint (){
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float[] getSpeed(){
        return new float[]{xSpeed,ySpeed};
    }

    @Override
    public String toString() {
        return "("+ Arrays.toString(super.getXY()) +"), speed=("+ Arrays.toString(this.getSpeed()) +")";
    }

    public Object move(){
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}
