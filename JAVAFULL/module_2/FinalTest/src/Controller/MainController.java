package Controller;

import Service.IPhoneService;
import Service.PhoneServiceImp;

import java.util.Scanner;

public class MainController {
    public static Scanner scanner = new Scanner(System.in);
    public static IPhoneService iPhoneService = new PhoneServiceImp();

    public static void main(String[] args) {
        try {
//            DataService.CopyData();
            while (true) {
                System.out.println("--CHƯƠNG TRÌNH QUẢN LÍ ĐIỆN THOẠI--");
                System.out.print("Chọn chức năng theo số (để tiếp tục):\n" +
                "1. Thêm mới\n" +
                "2. Xóa\n" +
                "3. Xem danh sách điện thoai\n" +
                "4. Tìm kiếm\n" +
                "5. Thoát\n" +
                "Chọn chức năng: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        AddingPhoneMenu.AddingMenu();
                        break;
                    case 2:
                        iPhoneService.xoa();
                        break;
                    case 3:
                        iPhoneService.xemDanhSach();
                        break;
                    case 4:
                        iPhoneService.timKiem();
                        break;
                    case 5:
                        System.exit(0);
                }
            }
        } catch (Exception e) {
            System.out.println("Enter your choice (number)...");
        }
    }
}

