package Repository;

import Model.BenhAn;

import java.util.List;

public interface BenhAnRepository {
    List<BenhAn> findAll();
    BenhAn findById(String ma_benh_an);
}
