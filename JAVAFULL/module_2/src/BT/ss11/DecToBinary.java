package BT.ss11;


import java.util.Scanner;
import java.util.Stack;

public class DecToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int dec = scanner.nextInt();
        Stack<Integer> bin = new Stack<>();
        while (dec != 0) {
            bin.push(dec%2);
            dec = dec/2;
//            System.out.println(dec + " " + (dec%2));
        }
        System.out.println("Bin: ");
        int a = bin.size();
        for (int i = 0; i < a; i++) {
            System.out.print(bin.pop()+"");
        }
    }
}
