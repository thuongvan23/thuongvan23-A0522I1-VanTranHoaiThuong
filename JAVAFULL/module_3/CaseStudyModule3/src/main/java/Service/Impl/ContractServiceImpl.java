package Service.Impl;

import Model.Contract;
import Repository.ContractRepository;
import Repository.Impl.ContractRepositoryImpl;
import Service.ContractService;

import java.util.List;

public class ContractServiceImpl implements ContractService {
    ContractRepository contractRepository = new ContractRepositoryImpl();
    @Override
    public void createContract(Contract contract) {
        contractRepository.createContract(contract);
    }

    @Override
    public void deleteById(String id) {
        contractRepository.deleteById(id);
    }

    @Override
    public Contract findById(String id) {
        return contractRepository.findById(id);
    }

    @Override
    public List<Contract> findAll() {
        return contractRepository.findAll();
    }
}
