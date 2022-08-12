package BT;

import java.util.Scanner;

public class deleteArrElements {
    public static void main(String[] args) {
        int[] Arr = {1, 2, 5, 7, 9, 10};
        System.out.print("Arr: ");
        for (int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i] + "\t");
        }
        while (1>0){
        int[] Arr1 = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Value you want to delete: ");
        int deletingEle = scanner.nextInt();
//        System.out.print(deletingEle);
        for (int i = 0; i < Arr.length; i++){
            for (int j = 0; j<Arr1.length; j++){
                if (Arr[i]!=deletingEle){
                    Arr1[j]=Arr[i];
                    System.out.println(Arr1[j]);
                    break;
                    }
                }
            }
        }
    }
}
