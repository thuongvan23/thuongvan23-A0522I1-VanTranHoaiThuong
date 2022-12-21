package Service.Impl;

import Model.BenhAn;
import Repository.BenhAnRepository;
import Repository.Impl.BenhAnRepositoryImpl;
import Service.BenhAnService;
import Service.BenhNhanService;

import java.util.List;

public class BenhAnServiceImpl implements BenhAnService {

    private BenhAnRepository benhAnRepository = new BenhAnRepositoryImpl();

    @Override
    public List<BenhAn> findAll() {
        return benhAnRepository.findAll();
    }

    @Override
    public BenhAn findById(String ma_benh_an) {
        return benhAnRepository.findById(ma_benh_an);
    }
}
