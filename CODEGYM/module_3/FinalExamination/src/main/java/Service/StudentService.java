package Service;

import Model.Student;


import java.util.LinkedHashSet;
import java.util.List;

public interface StudentService {
    void save(Student student);
    void update(Student student, String idUpdate);
    void deleteById(String id);
    Student findById(String id);
    List<Student> findAll();
}
