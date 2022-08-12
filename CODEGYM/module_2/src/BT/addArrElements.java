package BT;

import java.util.Scanner;

public class addArrElements {
    public static void main(String[] args) {
        int[] Arr = {1, 2, 5, 7, 9, 10};
        int[] Arr1 = new int[7];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Arr: ");
        for (int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i] + "\t");
        }
        System.out.print("Value you want to add: ");
        int addEle = scanner.nextInt();
        for (int i = 0; i < Arr.length; i++){
            Arr1[i] = Arr[i];
            }
        Arr1[Arr1.length-1] = addEle;
        System.out.print("Arr1: ");
        for (int i = 0; i < Arr1.length; i++) {
            System.out.println(Arr1[i] + "\t");
        }
        }
    }
