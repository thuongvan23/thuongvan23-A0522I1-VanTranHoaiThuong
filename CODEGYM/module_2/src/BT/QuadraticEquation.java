package BT;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c, d;

    public QuadraticEquation (double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public  double getA() {
        return a;
    }
    public  double getB() {
        return b;
    }
    public  double getC() {
        return c;
    }
    public  double getDiscriminant(){
        return b*b-4*a*c;
    }
    public  double getRoot1(){
        return ((-b-Math.sqrt(this.getDiscriminant()))/(2*a));
    }
    public double getRoot2(){
        return ((-b+Math.sqrt(this.getDiscriminant()))/(2*a));
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap a (ax^2+bx+c=0): ");
        double a = scanner.nextDouble();
        System.out.println("Nhap b (ax^2+bx+c=0): ");
        double b = scanner.nextDouble();
        System.out.println("Nhap c (ax^2+bx+c=0): ");
        double c = scanner.nextDouble();
        QuadraticEquation apply = new QuadraticEquation(a, b, c);
        if (apply.getDiscriminant()<0){
            System.out.println("None");
        } else if (apply.getDiscriminant()==0){
            System.out.println("Equation have 1 double solution: " + apply.getRoot1());
        } else {
            System.out.println("Solution 1: " + apply.getRoot1());
            System.out.println("Solution2: " + apply.getRoot2());
        }
    }
}
