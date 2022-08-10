package BT.Draw;

import java.util.Scanner;

public class isoscelesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input hight: ");
        int hight = scanner.nextInt();
        for (int i=1; i<=hight; i++){
            for (int j=1; j<=hight; j++){
                if (j==hight-i+1){
                    for (int k=1; k<=2*i-1; k++){
                        System.out.print("*");
                    }
                } else {System.out.print(" ");}
            }
            System.out.println("");
        }
    }
}
