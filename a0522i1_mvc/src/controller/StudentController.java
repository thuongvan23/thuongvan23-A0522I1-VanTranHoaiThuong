package controller;

import service.IStudentService;
import service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    //DI
    private static final IStudentService iStudentService = new StudentService();
    private static final Scanner scanner = new Scanner(System.in);

    public static void menuStudent() {
        while (true) {
            System.out.println("Quản lý học sinh.");
            System.out.println("1. Thêm mới học sinh");
            System.out.println("2. Hiển thị danh sách học sinh");
            System.out.println("3. Xóa học sinh");
            System.out.println("4. Tìm kiếm học sinh");
            System.out.println("5. Quay về menu chính");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iStudentService.addStudent();
                    System.out.println("Thêm mới thành công.");
                    break;
                case 2:
                    iStudentService.display();
                    break;
                case 3:
                    iStudentService.removeStudentByCode();
                    break;
                case 4:
                    iStudentService.findStudent();
                    break;
                case 5:
                    return;
            }
        }
    }
}
