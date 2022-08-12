package BT;

import java.util.Scanner;

public class sumOfCol {
    public static void main(String[] args) {
        int A= new int [4][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so Hang:");
        int soHang = scanner.nextInt();
        System.out.println("Nhap so Cot:");
        int soCot = scanner.nextInt();
        void nhapMT() {
            A = new int[soHang][soCot];
            System.out.println("Nhap ma tran "+ soHang +" x"+ soCot);
            for(int i=0;i&lt;soHang;i++)
            for(int j=0;j&lt;soCot;j++) {
                System.out.println("A["+(i+1)+"]["+(j+1)+"]: ");
                A[i][j]=nhapInt();
            }
        }
    }
}
