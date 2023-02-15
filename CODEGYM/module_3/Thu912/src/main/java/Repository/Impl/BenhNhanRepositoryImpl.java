package Repository.Impl;

import Model.BenhNhan;
import Repository.BenhNhanREpository;
import Service.BenhAnService;
import Service.Impl.BenhAnServiceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class BenhNhanRepositoryImpl implements BenhNhanREpository {

    private final BenhAnService benhAnService = new BenhAnServiceImpl();

    private static final String SELECT_FROM_BenhNhan = "select * from benh_nhan";
    private static final String DELETE_WITH_CONDITION = "delete from benh_nhan where ma_benh_nhan=?";
    private static final String UPDATE_WITH_CONDITION = "update benh_nhan set ma_benh_nhan=?, ma_benh_an=?, ten_benh_nhan=?, ngay_nhap_vien=?, ngay_ra_vien=?, li_do_nhap_vien=? where ma_benh_nhan=?";
    //    private static final String SELECT_FROM_STUDENTS_WHERE_NAME = "select * from students where name like ?";
    private static final String INSERT_BenhNhan = "insert into students(ma_benh_nhan, ma_benh_an, ten_benh_nhan, ngay_nhap_vien, ngay_ra_vien, li_do_nhap_vien) value (?,?,?,?,?,?) ";
    private final BaseRepository baseRepository = new BaseRepository();
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public void save(BenhNhan benhNhan) {
        Connection connection = baseRepository.getConnectionJavaToDb();
        try {
            java.sql.Date sqlDate_nhap = new java.sql.Date(benhNhan.getNgay_nhap_vien().getTime());
            java.sql.Date sqlDate_ra = new java.sql.Date(benhNhan.getNgay_ra_vien().getTime());
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_BenhNhan);
            preparedStatement.setString(1, benhNhan.getMa_benh_nhan());
            preparedStatement.setString(2, benhNhan.getBenh_an().getMa_benh_an());
            preparedStatement.setString(3, benhNhan.getTen());
            preparedStatement.setDate(4, sqlDate_nhap);
            preparedStatement.setDate(5, sqlDate_ra);
            preparedStatement.setString(6, benhNhan.getLi_do_nhap_vien());
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(BenhNhan benhNhan, String idUpdate) {
        Connection connection = baseRepository.getConnectionJavaToDb();
        try {
            java.sql.Date sqlDate_nhap = new java.sql.Date(benhNhan.getNgay_nhap_vien().getTime());
            java.sql.Date sqlDate_ra = new java.sql.Date(benhNhan.getNgay_ra_vien().getTime());
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_WITH_CONDITION);
            preparedStatement.setString(1, benhNhan.getMa_benh_nhan());
            preparedStatement.setString(2, benhNhan.getBenh_an().getMa_benh_an());
            preparedStatement.setString(3, benhNhan.getTen());
            preparedStatement.setDate(4, sqlDate_nhap);
            preparedStatement.setDate(5, sqlDate_ra);
            preparedStatement.setString(6, benhNhan.getLi_do_nhap_vien());
            preparedStatement.setString(7, idUpdate);
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteById(String ma_benh_nhan) {
        Connection connection = baseRepository.getConnectionJavaToDb();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_WITH_CONDITION);
            preparedStatement.setString(1, ma_benh_nhan);
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public BenhNhan findById(String ma_benh_nhan) {
        for (BenhNhan benhNhan : findAll()){
            if (ma_benh_nhan.equals(benhNhan.getMa_benh_nhan())){
                return benhNhan;
            }
        }
        return null;
    }

    @Override
    public List<BenhNhan> findAll() {
        List<BenhNhan> benhNhanList = new ArrayList<>();
        try {
            Connection connection = baseRepository.getConnectionJavaToDb();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_BenhNhan);
            ResultSet resultSet = preparedStatement.executeQuery();
            BenhNhan benhNhan;
            while (resultSet.next()){
                benhNhan = new BenhNhan();
                benhNhan.setMa_benh_nhan(resultSet.getString("ma_benh_nhan"));
                benhNhan.setBenh_an(benhAnService.findById(resultSet.getString("ma_benh_an")));
                benhNhan.setTen(resultSet.getString("ten_benh_nhan"));
                benhNhan.setNgay_nhap_vien(df.parse(resultSet.getString("ngay_nhap_vien")));
                benhNhan.setNgay_ra_vien(df.parse(resultSet.getString("ngay_ra_vien")));
                benhNhan.setLi_do_nhap_vien(resultSet.getString("li_do_nhap_vien"));
                benhNhanList.add(benhNhan);
            }
            connection.close();
        } catch (SQLException | ParseException e) {
            e.printStackTrace();
        }
        return benhNhanList;
    }
}
