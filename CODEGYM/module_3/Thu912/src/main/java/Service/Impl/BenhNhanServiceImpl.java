package Service.Impl;

import Model.BenhNhan;
import Repository.BenhNhanREpository;
import Repository.Impl.BenhNhanRepositoryImpl;
import Service.BenhNhanService;

import java.util.List;

public class BenhNhanServiceImpl implements BenhNhanService {
    private BenhNhanREpository benhNhanREpository = new BenhNhanRepositoryImpl();
    @Override
    public void save(BenhNhan benhNhan) {
        benhNhanREpository.save(benhNhan);
    }

    @Override
    public void update(BenhNhan benhNhan, String idUpdate) {
        benhNhanREpository.update(benhNhan, idUpdate);
    }

    @Override
    public void deleteById(String ma_benh_nhan) {
        benhNhanREpository.deleteById(ma_benh_nhan);
    }

    @Override
    public BenhNhan findById(String ma_benh_nhan) {
        return benhNhanREpository.findById(ma_benh_nhan);
    }

    @Override
    public List<BenhNhan> findAll() {
        return benhNhanREpository.findAll();
    }
}
