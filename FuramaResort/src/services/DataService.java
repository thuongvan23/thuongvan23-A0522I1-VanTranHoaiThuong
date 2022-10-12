package services;

import Models.Staffs;
import Repository.IStaffRepository;
import Repository.StaffRepositoryImp;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class DataService {
    public static IStaffRepository iStaffRepository = new StaffRepositoryImp();
    public static void CopyData(){
        String file = "D:\\thuongvan23-A0522I1-VanTranHoaiThuong\\FuramaResort\\src\\Repository\\Data\\villa.csv";
        try {
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);

            while (is.available() > 0) {
                Staffs staff = (Staffs) ois.readObject();
                iStaffRepository.addingStaff(staff);
            }

            is.close();
            ois.close();

        } catch (Exception e) {
            System.out.print("");
//            e.printStackTrace();
        }
    }
}
