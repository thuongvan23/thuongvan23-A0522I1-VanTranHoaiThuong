package Service.Impl;

import Model.Payment;
import Repository.Impl.PaymentRepositoryImpl;
import Repository.PaymentRepository;
import Service.PaymentService;

import java.util.List;

public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository = new PaymentRepositoryImpl();

    @Override
    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment findById(int idPayment) {
        return paymentRepository.findById(idPayment);
    }
}
