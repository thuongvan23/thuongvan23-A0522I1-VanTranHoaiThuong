package service.impl;

import model.Coach;
import model.Student;
import repository.ICoachRepository;
import repository.impl.CoachRepository;
import service.ICoachService;

import java.util.List;
import java.util.Scanner;

public class CoachService implements ICoachService {
    private static ICoachRepository iCoachRepository = new CoachRepository();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void addCoach() {
        Coach coach = this.infoCoach();
        iCoachRepository.addCoach(coach);
    }

    @Override
    public void display() {
        List<Coach> coachList = iCoachRepository.getAll();
        for(Coach coach : coachList){
            System.out.println(coach);
        }
    }

    @Override
    public void removeCoachByCode() {
        System.out.println("Nhập code Coach bạn muốn xóa: ");
        int code = scanner.nextInt();
        loop:
        while (true) {
            for (Coach coach : iCoachRepository.getAll()) {
                if (coach.getCode() == code) {
                    System.out.println("Are you sure (1.Yes or 2.No): ");
                    Scanner scanner1 = new Scanner(System.in);
                    if (scanner1.nextInt() == 1) {
                        iCoachRepository.getAll().remove(coach);
                        System.out.println("Xóa thành công.");
                        break loop;
                    } else {
                        return;
                    }
                }
            }
            System.out.println("Giảng viên không có trong danh sách.");
            break;
        }
    }

    @Override
    public void findCoach() {
        System.out.println("Nhập code Coach bạn muốn kiểm tra: ");
        int code = scanner.nextInt();
        loop:
        while (true) {
            for (Coach coach : iCoachRepository.getAll()) {
                if (coach.getCode() == code) {
                    System.out.println(coach);
                    break loop;
                }
            }
            System.out.println("Coach không tồn tại trong danh sách");
            break;
        }
    }
    private Coach infoCoach(){
        System.out.print("Mời bạn nhập code Coach: ");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời bạn nhập tên Coach: ");
        String name = scanner.nextLine();
        System.out.print("Mời bạn nhập ngày sinh Coach: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Giới tính: ");
        String Gender = scanner.nextLine();
        System.out.print("Chuyên môn: ");
        String Specialize = scanner.nextLine();
        Coach coach = new Coach(code, name, dateOfBirth, Gender, Specialize);
        return coach;
    }
}
