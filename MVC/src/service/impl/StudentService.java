package service.impl;

import model.Student;
import repository.IStudentRepository;
import repository.impl.StudentRepository;
import service.IStudentService;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private IStudentRepository iStudentRepository = new StudentRepository();

    @Override
    public void addStudent() {
        Student student = this.infoStudent();
        iStudentRepository.addStudent(student);
    }

    @Override
    public void display() {
        List<Student> studentList = iStudentRepository.getAll();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void removeStudentByCode() {
        System.out.println("Nhập code học sinh bạn muốn xóa: ");
        int code = scanner.nextInt();
        loop:
        while (true) {
            for (Student student : iStudentRepository.getAll()) {
                if (student.getCode() == code) {
                    System.out.println("Are you sure (1.Yes or 2.No): ");
//                    Scanner scanner1 = new Scanner(System.in);
                    if (scanner.nextInt() == 1) {
                        iStudentRepository.getAll().remove(student);
                        System.out.println("Xóa thành công.");
                        break loop;
                    } else {
                        return;
                    }
                }
            }
            System.out.println("Học sinh không có trong danh sách.");
            break;
        }
    }

    @Override
    public void findStudent() {
        System.out.println("Nhập code học sinh bạn muốn kiểm tra: ");
        int code = scanner.nextInt();
        loop:
        while (true) {
            for (Student student : iStudentRepository.getAll()) {
                if (student.getCode() == code) {
                    System.out.println(student);
                    break loop;
                }
            }
            System.out.println("Học sinh không tồn tại trong danh sách");
            break;
        }
    }

    private Student infoStudent() {
        System.out.print("Mời bạn nhập code học sinh: ");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời bạn nhập tên học sinh: ");
        String name = scanner.nextLine();
        System.out.print("Mời bạn nhập ngày sinh học sinh: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Mời bạn nhập lớp của học sinh: ");
        String nameClass = scanner.nextLine();
        System.out.print("Mời bạn nhập điểm của học sinh: ");
        double point = Double.parseDouble(scanner.nextLine());
        System.out.print("Giới tính: ");
        String Gender = scanner.nextLine();
        Student student = new Student(code, name, dateOfBirth, Gender, nameClass, point);
        return student;
    }
}
