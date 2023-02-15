package Service;

import Model.Contract;

import java.util.List;

public interface ContractService {
    void createContract(Contract contract);
    void deleteById(String id);
    Contract findById(String id);
    List<Contract> findAll();
}
