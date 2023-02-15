package Service.Impl;

import Model.StudentType;
import Repository.Impl.StudentTypeRepositoryImpl;
import Repository.StudentTypeRepository;
import Service.StudentTypeService;

import java.util.List;

public class StudentTypeServiceImpl implements StudentTypeService {
    private StudentTypeRepository studentTypeRepository = new StudentTypeRepositoryImpl();
    @Override
    public List<StudentType> findAll() {
        return studentTypeRepository.findAll();
    }

    @Override
    public StudentType findById(int id) {
        return studentTypeRepository.findById(id);
    }
}
