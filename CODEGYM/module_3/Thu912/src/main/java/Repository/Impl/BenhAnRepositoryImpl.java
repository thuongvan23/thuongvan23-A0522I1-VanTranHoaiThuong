package Repository.Impl;

import Model.BenhAn;
import Repository.BenhAnRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BenhAnRepositoryImpl implements BenhAnRepository {

    private static final String SELECT_FROM_BenhAn = "select * from benh_an";
    private final BaseRepository baseRepository = new BaseRepository();


    @Override
    public List<BenhAn> findAll() {
        List<BenhAn> benhAnList = new ArrayList<>();
        try {
            Connection connection = baseRepository.getConnectionJavaToDb();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_BenhAn);
            ResultSet resultSet = preparedStatement.executeQuery();
            BenhAn benhAn;
            while (resultSet.next()){
                benhAn = new BenhAn();
                benhAn.setMa_benh_an(resultSet.getString("ma_benh_an"));
                benhAn.setTen_benh_an(resultSet.getString("ten_benh_an"));
                benhAnList.add(benhAn);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  benhAnList;
    }

    @Override
    public BenhAn findById(String ma_benh_an) {
        for (BenhAn benhAn : findAll()){
            if (benhAn.getMa_benh_an().equals(ma_benh_an)){
                return benhAn;
            }
        }
        return null;
    }
}
