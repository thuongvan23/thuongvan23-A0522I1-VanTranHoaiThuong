package Service;

import Model.BenhNhan;

import java.util.List;

public interface BenhNhanService {
    void save(BenhNhan benhNhan);
    void update(BenhNhan benhNhan, String idUpdate);
    void deleteById(String ma_benh_nhan);
    BenhNhan findById(String ma_benh_nhan);
    List<BenhNhan> findAll();
}
