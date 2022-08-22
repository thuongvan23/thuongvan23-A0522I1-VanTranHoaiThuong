package BT;

import java.util.Scanner;

public class sumOfCol {
    public static void main(String[] args) {
        int[][] array= {
                {1,2,3,4,5,6},
                {6,12,6,21,2,45},
                {23,12,44,12,2,1}
        };
        System.out.print("Mảng 2 chiều là: "+"\n");
        for (int i=0;i<array.length;i++) {
            for (int j=0;j<array[i].length;j++) {
                System.out.print(array[i][j]+",");
            }
            System.out.print("\n");
        }
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhập cột muốn tính: ");
        int number= scanner.nextInt();
        if (number>array[0].length) {
            System.out.println("Nhập lại");
        }else {
            int total=0;
            for (int i=0;i<array.length;i++) {
                total= total + array[i][number-1];
            }
            System.out.println("Tổng các phần cột "+ number+ " là: "+total);
        }
    }
}
