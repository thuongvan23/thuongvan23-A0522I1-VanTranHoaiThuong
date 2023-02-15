package Repository.Impl;

import Model.StudentType;
import Repository.StudentTypeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentTypeRepositoryImpl implements StudentTypeRepository {
    private static final String SELECT_FROM_STUDENTTYPES = "select * from student_types";
    private final BaseRepository baseRepository = new BaseRepository();
//    private static final Map<Integer, StudentType> studentTypeMap = new HashMap<>();
//
//    static {
//        studentTypeMap.put(1, new StudentType(1, "Good"));
//        studentTypeMap.put(2, new StudentType(2, "Normal"));
//        studentTypeMap.put(3, new StudentType(3, "Bad"));
//    }

    @Override
    public List<StudentType> findAll() {
        List<StudentType> studentTypeList = new ArrayList<>();
        try {
            Connection connection = baseRepository.getConnectionJavaToDb();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_STUDENTTYPES);
            ResultSet resultSet = preparedStatement.executeQuery();
            StudentType studentType;
            while (resultSet.next()){
                studentType = new StudentType();
                studentType.setId(resultSet.getInt("student_type_id"));
                studentType.setType(resultSet.getString("student_type"));
                studentTypeList.add(studentType);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  studentTypeList;
//        return new ArrayList<>(studentTypeMap.values());
    }

    @Override
    public StudentType findById(int id) {
        for (StudentType studentType : findAll()){
            if (studentType.getId() == id){
                return studentType;
            }
        }
        return null;
//        return studentTypeMap.get(id);
    }
}
