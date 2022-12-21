package Repository;

import Model.Contract;

import java.util.List;

public interface ContractRepository {
    void createContract(Contract contract);
    void deleteById(String id);
    Contract findById(String id);
    List<Contract> findAll();
}
