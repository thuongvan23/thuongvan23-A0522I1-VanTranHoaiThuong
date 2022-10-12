package services.Implement;

import Models.Staffs;
import Repository.IStaffRepository;
import Repository.StaffRepositoryImp;
import services.StaffsService;

import java.io.*;
import java.util.Scanner;

public class StaffsServiceImp implements StaffsService {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IStaffRepository iStaffRepository = new StaffRepositoryImp();

    @Override
    public void add() {
        String file = "D:\\thuongvan23-A0522I1-VanTranHoaiThuong\\FuramaResort\\src\\Repository\\Data\\villa.csv";
        try {

            Staffs staff = this.infoStaff();
            iStaffRepository.addingStaff(staff);

            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            for (Staffs staff1 : iStaffRepository.getAll()) {
                oos.writeObject(staff1);
            }

            os.close();
            oos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        String file = "D:\\thuongvan23-A0522I1-VanTranHoaiThuong\\FuramaResort\\src\\Repository\\Data\\villa.csv";

        try {
            InputStream is = new FileInputStream(file){};
            ObjectInputStream ois = new ObjectInputStream(is);

            while (is.available() > 0) {
                Staffs staffs1 = (Staffs) ois.readObject();
                System.out.println(staffs1);
            }

            is.close();
            ois.close();

        } catch (Exception e) {
            System.out.println("Have no Staff...Please, add new...");
//            e.printStackTrace();
        }
    }

    @Override
    public void editInfo() {
//          Nhập staffId
        System.out.print("Enter staffId: ");
        int staffId = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
//          Thay đổi đối tượng trong mảng
        for (Staffs staff : iStaffRepository.getAll()) {
            if (staffId == staff.getStaffId()) {
                flag = true;
                System.out.println(staff);
                System.out.println("Edit... ");
                iStaffRepository.getAll().set(iStaffRepository.getAll().indexOf(staff), infoStaff());
                break;
            }
        }
//          Ghi file
        if (flag) {
            String file = "D:\\thuongvan23-A0522I1-VanTranHoaiThuong\\FuramaResort\\src\\Repository\\Data\\villa.csv";
            try {
                OutputStream os = new FileOutputStream(file){};
                ObjectOutputStream oos = new ObjectOutputStream(os);
                for (Staffs staffs : iStaffRepository.getAll()) {
                    oos.writeObject(staffs);
                }

                os.close();
                oos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Staff doesn't exist.");
        }
    }

    private Staffs infoStaff() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter birthday: ");
        String birthday = scanner.nextLine();
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter identifyId: ");
        String identifyId = scanner.nextLine();
        System.out.print("Enter phoneNumber: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter staffId: ");
        int staffId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter level: ");
        String level = scanner.nextLine();
        System.out.print("Enter position: ");
        String position = scanner.nextLine();
        System.out.print("Enter salary: ");
        int salary = Integer.parseInt(scanner.nextLine());
        Staffs staff = new Staffs(name, birthday, gender, identifyId, phoneNumber, email, staffId, level, position, salary);
        return staff;
    }
}
