package Repository.Impl;

import Model.Contract;
import Repository.ContractRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContractRepositoryImpl implements ContractRepository {
    Map<String, Contract> contractMap = new HashMap<>();
    @Override
    public void createContract(Contract contract) {
        contractMap.put(contract.getContractId(), contract);
    }

    @Override
    public void deleteById(String id) {
        contractMap.remove(id);
    }

    @Override
    public Contract findById(String id) {
        return contractMap.get(id);
    }

    @Override
    public List<Contract> findAll() {
        return new ArrayList<>(contractMap.values());
    }
}
