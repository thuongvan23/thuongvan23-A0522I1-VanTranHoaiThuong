package Service.Impl;

import Model.Student;
import Repository.Impl.StudentRepositoryImpl;
import Repository.StudentRepository;
import Service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    StudentRepository studentRepository = new StudentRepositoryImpl();
    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    public void update(Student student, String idUpdate){
        studentRepository.update(student, idUpdate);
    }

    @Override
    public void deleteById(String id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student findById(String id) {
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
