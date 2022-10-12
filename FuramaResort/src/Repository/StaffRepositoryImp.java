package Repository;

import Models.Staffs;

import java.util.ArrayList;
import java.util.List;

public class StaffRepositoryImp implements IStaffRepository{
    private static List<Staffs> staffsList = new ArrayList<>();
    @Override
    public void addingStaff(Staffs staff) {
        staffsList.add(staff);
    }

    @Override
    public List<Staffs> getAll() {
        return staffsList;
    }
}
