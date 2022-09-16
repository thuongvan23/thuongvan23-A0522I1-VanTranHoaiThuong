package BT.ss14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DescribeInsertSort {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = scanner.nextInt();
        System.out.println("Enter numbers: ");
        for (int i = 0; i < length; i++) {
            int num = scanner.nextInt();
            arr.add(num);
        }
        for (int j = 1; j < length; j++) {
            for (int k = 1; k <= j; k++) {
                if (arr.get(j-k+1) < arr.get(j - k)) {
                    arr.add(j - k, arr.get(j-k+1));
                    arr.remove(j + k+1);
                }
                System.out.println(arr);
//                j-k-1(2),j-k(4), j-k(3),j-k+1(4),j-k+2(5)
//
            }
        }
    }
}
