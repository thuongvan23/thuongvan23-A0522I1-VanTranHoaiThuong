package Repository.Impl;

import Model.Payment;
import Repository.PaymentRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PaymentRepositoryImpl implements PaymentRepository {

    private static final String SELECT_FROM_payment = "select * from payment";
    private final BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Payment> findAll() {
        List<Payment> paymentList = new ArrayList<>();
        try {
            Connection connection = baseRepository.getConnectionJavaToDb();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_payment);
            ResultSet resultSet = preparedStatement.executeQuery();
            Payment payment;
            while (resultSet.next()){
                payment = new Payment();
                payment.setId(resultSet.getInt("payment_id"));
                payment.setHowToPay(resultSet.getString("how_to_pay"));
                paymentList.add(payment);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  paymentList;
    }

    @Override
    public Payment findById(int idPayment) {
        for (Payment payment : findAll()){
            if (payment.getId() == idPayment){
                return payment;
            }
        }
        return null;
    }
}
