package Repository;

import Model.StudentType;

import java.util.List;

public interface StudentTypeRepository {
    List<StudentType> findAll();
    StudentType findById(int id);
}
