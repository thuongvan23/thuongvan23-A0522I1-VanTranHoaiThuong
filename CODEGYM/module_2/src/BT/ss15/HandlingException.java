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
        } catch (Exception e){
            System.out.println("ABC isn't a Triangle.");
        }
        System.out.println("ABC is a Triangle.");
    }
}
