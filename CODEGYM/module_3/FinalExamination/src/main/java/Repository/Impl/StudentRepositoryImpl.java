package Repository.Impl;

import Model.Student;
import Repository.StudentRepository;
import Repository.StudentTypeRepository;
import Service.Impl.StudentTypeServiceImpl;
import Service.StudentService;
import Service.StudentTypeService;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class StudentRepositoryImpl implements StudentRepository {
    private final StudentTypeService studentTypeService = new StudentTypeServiceImpl();

    private static final String SELECT_FROM_STUDENTS = "select * from students";
    private static final String DELETE_WITH_CONDITION = "delete from students where id=?";
    private static final String UPDATE_WITH_CONDITION = "update students set id=?, name=?, age=?, birthday=?, gender=?, student_type_id=? where id=?";
//    private static final String SELECT_FROM_STUDENTS_WHERE_NAME = "select * from students where name like ?";
    private static final String INSERT_STUDENT = "insert into students(id, name, age, birthday, gender, student_type_id) value (?,?,?,?,?,?) ";
    private final BaseRepository baseRepository = new BaseRepository();
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public void save(Student student) {
        Connection connection = baseRepository.getConnectionJavaToDb();
        try {
            java.sql.Date sqlDate = new java.sql.Date(student.getBirthday().getTime());
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT);
            preparedStatement.setString(1, student.getId());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setInt(3, student.getAge());
            preparedStatement.setDate(4, sqlDate);
            preparedStatement.setInt(5, student.getGender());
            preparedStatement.setInt(6, student.getStudentType().getId());
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Student student, String idUpdate) {
        Connection connection = baseRepository.getConnectionJavaToDb();
        try {
            java.sql.Date sqlDate = new java.sql.Date(student.getBirthday().getTime());
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_WITH_CONDITION);
            preparedStatement.setString(1, student.getId());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setInt(3, student.getAge());
            preparedStatement.setDate(4, sqlDate);
            preparedStatement.setInt(5, student.getGender());
            preparedStatement.setInt(6, student.getStudentType().getId());
            preparedStatement.setString(7, idUpdate);
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteById(String id) {
        Connection connection = baseRepository.getConnectionJavaToDb();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_WITH_CONDITION);
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Student findById(String id) {
        for (Student student : findAll()){
            if (id.equals(student.getId())){
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();
        try {
            Connection connection = baseRepository.getConnectionJavaToDb();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_STUDENTS);
            ResultSet resultSet = preparedStatement.executeQuery();
            Student student;
            while (resultSet.next()){
                student = new Student();
                student.setId(resultSet.getString("id"));
                student.setName(resultSet.getString("name"));
                student.setAge(resultSet.getInt("age"));
                student.setGender(resultSet.getInt("gender"));
                student.setStudentType(studentTypeService.findById(resultSet.getInt("student_type_id")));
                student.setBirthday(df.parse(resultSet.getString("birthday")));
                studentList.add(student);
            }
            connection.close();
        } catch (SQLException | ParseException e) {
            e.printStackTrace();
        }
        return studentList;
    }
}
