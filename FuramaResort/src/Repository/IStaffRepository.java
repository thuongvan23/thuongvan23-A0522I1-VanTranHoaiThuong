package Repository;

import Models.Staffs;

import java.util.ArrayList;
import java.util.List;

public interface IStaffRepository {
    void addingStaff(Staffs staff);

    List<Staffs> getAll();

}
