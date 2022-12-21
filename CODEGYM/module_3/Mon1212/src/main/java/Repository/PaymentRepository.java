package Repository;

import Model.Payment;

import java.util.List;

public interface PaymentRepository {
    List<Payment> findAll();
    Payment findById(int idPayment);
}
