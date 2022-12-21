package Repository.Impl;

import Model.House;
import Repository.HouseRepository;
import Service.Impl.PaymentServiceImpl;
import Service.PaymentService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class HouseRepositoryImpl implements HouseRepository {

    private final PaymentService paymentService = new PaymentServiceImpl();

    private static final String SELECT_FROM_house = "select * from house";
    private static final String DELETE_WITH_CONDITION = "delete from house where id=?";
    private static final String INSERT_House = "insert into house(payment_id, username, phone_number, date_start, note) value (?,?,?,?,?) ";
    private final BaseRepository baseRepository = new BaseRepository();
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public void save(House house) {
        Connection connection = baseRepository.getConnectionJavaToDb();
        try {
            java.sql.Date sqlDate_start = new java.sql.Date(house.getDateStart().getTime());
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_House);
            preparedStatement.setInt(1, house.getPayment().getId());
            preparedStatement.setString(2, house.getUserName());
            preparedStatement.setInt(3, house.getPhoneNumber());
            preparedStatement.setDate(4, sqlDate_start);
            preparedStatement.setString(5, house.getNote());
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteById(int houseId) {
        Connection connection = baseRepository.getConnectionJavaToDb();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_WITH_CONDITION);
            preparedStatement.setInt(1, houseId);
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public House findById(int houseId) {
        for (House house : findAll()){
            if (house.getId() == houseId){
                return house;
            }
        }
        return null;
    }

    @Override
    public List<House> findAll() {
        List<House> houseList = new ArrayList<>();
        try {
            Connection connection = baseRepository.getConnectionJavaToDb();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_house);
            ResultSet resultSet = preparedStatement.executeQuery();
            House house;
            while (resultSet.next()){
                house = new House();
                house.setId(resultSet.getInt("id"));
                house.setPayment(paymentService.findById(resultSet.getInt("payment_id")));
                house.setPhoneNumber(resultSet.getInt("phone_number"));
                house.setUserName(resultSet.getString("username"));
                house.setDateStart(df.parse(resultSet.getString("date_start")));
                house.setNote(resultSet.getString("note"));
                houseList.add(house);
            }
            connection.close();
        } catch (SQLException | ParseException e) {
            e.printStackTrace();
        }
        return houseList;
    }
}
