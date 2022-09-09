package controller;

import service.ICoachService;
import service.impl.CoachService;

import java.util.Scanner;
public class CoachController {
    private static final ICoachService iCoachService = new CoachService();
    private static final Scanner scanner = new Scanner(System.in);

    public static void menuCoach() {
        while (true) {
            System.out.println("Quản lý giảng viên");
            System.out.println("1. Thêm mới giảng viên");
            System.out.println("2. Hiển thị danh sách giảng viên");
            System.out.println("3. Xóa giảng viên");
            System.out.println("4. Tìm kiếm giảng viên");
            System.out.println("5. Quay về menu chính");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iCoachService.addCoach();
                    System.out.println("Thêm mới thành công.");
                    break;
                case 2:
                    iCoachService.display();
                    break;
                case 3:
                    iCoachService.removeCoachByCode();
                    break;
                case 4:
                    iCoachService.findCoach();
                    break;
                case 5:
                    return;
            }
        }
    }
}