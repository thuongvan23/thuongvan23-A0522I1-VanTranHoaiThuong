package Service;

import Model.BenhAn;

import java.util.List;

public interface BenhAnService {
    List<BenhAn> findAll();
    BenhAn findById(String ma_benh_an);
}
