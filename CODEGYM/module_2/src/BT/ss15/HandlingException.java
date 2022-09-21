package BT.ss15;

import java.util.Scanner;

public class HandlingException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter size of Triangle (a): ");
            int a = scanner.nextInt();
            System.out.println("Enter size of Triangle (b): ");
            int b = scanner.nextInt();
            System.out.println("Enter size of Triangle (c): ");
            int c = scanner.nextInt();
            if(a<0|| b<0||c<0||a+b<=c||a+c<=b||b+c<=a)
                throw new IllegalTriangleException();
        } catch (IllegalTriangleException e){
            System.out.println("Input doesn't accepted.");
        }
    }
}
