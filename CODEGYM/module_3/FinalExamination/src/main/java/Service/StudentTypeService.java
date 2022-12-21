package Service;

import Model.StudentType;

import java.util.List;

public interface StudentTypeService {
    List<StudentType> findAll();
    StudentType findById(int id);
}
