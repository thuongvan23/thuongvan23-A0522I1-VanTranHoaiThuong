package BT.Draw;

import java.util.Scanner;

public class rightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input side lenght: ");
        int sideLenght = scanner.nextInt();
        for (int i=1; i<=sideLenght; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
