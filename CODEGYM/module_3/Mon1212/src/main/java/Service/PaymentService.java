package Service;

import Model.Payment;

import java.util.List;

public interface PaymentService {
    List<Payment> findAll();
    Payment findById(int idPayment);
}
