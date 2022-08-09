package BT;

import java.util.Scanner;

public class convertMoney {
    public static void main(String[] args) {
        while (1>0){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much (USD): ");
        int vnd = scanner.nextInt();
        int vndRe;
        vndRe = vnd * 23000;
        System.out.println("You have " + vndRe + " VNĐ");
        }
    }
}
