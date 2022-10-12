package Repository;

import Model.DienThoai;
import Model.DienThoaiChinhHang;
import Model.DienThoaiXachTay;

import java.util.List;

public interface IPhoneRepository {
    void themMoiDienThoaiChinhHang(DienThoaiChinhHang dienThoai);
    void themMoiDienThoaiXachTay(DienThoaiXachTay dienThoaiXachTay);

    List<DienThoai> getAll();
    List<DienThoaiChinhHang> getChinhHang();
    List<DienThoaiXachTay> getXachTay();
}
