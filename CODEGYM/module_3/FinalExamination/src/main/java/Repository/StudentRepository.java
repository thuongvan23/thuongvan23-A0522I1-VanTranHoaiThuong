package Repository;

import Model.Student;

import java.util.List;

public interface StudentRepository {
    void save(Student student);
    void update(Student student, String idUpdate);
    void deleteById(String id);
    Student findById(String id);
    List<Student> findAll();
}
