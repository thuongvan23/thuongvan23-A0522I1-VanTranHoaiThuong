package com.example.ss10_ecommerce.model;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day6_opt1_02 {
    int[] nums;

//    Hàm(phương thức, method) void là không trả về, hiểu đây là khai báo cho 1 khối lệnh có tên ranNums, khi mình .ranNums() thì nó sẽ chạy tuần tự
//    những câu lệnh ở trong
    public void ranNums() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua day so: ");
        int n = scan.nextInt();
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            Random rand = new Random();
            nums[i] = rand.nextInt();
        }
    }
//    Hàm displayNums() có chức năng hiển thị, void là nó chỉ chạy tuần tự từ đầu tới cuối trong hàm xong chạy tiếp phải dưới
//    chứ nó k trả về gì cả
//    ví dụ 1 bài toán cho đề là f(x) = x^2 + 2x + 1 thì mình chỉ đọc qua như chương trình chạy(thực thi) qua chứ k biết nó bắt tìm gì cả
//    cũng là hàm đó nhưng nếu đề bảo tìm cái gì đó ví dụ như tìm cực đại, tìm x, tìm cực tiểu thì nó là hàm có giá trị trả về
    public void displayNums() {
        System.out.println("Day so ngau nhien cua ban la: " + Arrays.toString(nums));
    }

//    Hàm main là hàm đặt biệt để chạy chương trình, chị chỉ cần biết ứa là được...
    public static void main(String[] args) {
        Day6_opt1_02 exerTwo = new Day6_opt1_02();
        exerTwo.ranNums();
        exerTwo.displayNums();
    }

}
