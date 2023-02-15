package Controller;

import Service.IPhoneService;
import Service.PhoneServiceImp;

import java.util.Scanner;

public class AddingPhoneMenu {
    public static IPhoneService iPhoneService = new PhoneServiceImp();
    public static Scanner scanner = new Scanner(System.in);

    public static void AddingMenu() {
        while (true) {
            System.out.print("1. Thêm điện thoại chính hãng:\n" +
                    "2. Thêm điện thoại xách tay\n" +
                    "3. Trở về\n" +
                    "Nhập lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iPhoneService.themMoiDienThoaiChinhHang();
                    System.out.println("Thêm mới thành công!!!");
                    break;
                case 2:
                    iPhoneService.themMoiDienThoaiXachTay();
                    System.out.println("Thêm mới thành công!!!");
                    break;
                case 3:
                    return;
            }
        }
    }
}
