package Repository;

import Model.DienThoai;
import Model.DienThoaiChinhHang;
import Model.DienThoaiXachTay;

import java.util.ArrayList;
import java.util.List;

public class PhoneRepositoryImp implements IPhoneRepository{
    private static List<DienThoai> danhSachDienThoai = new ArrayList<>();
    private static List<DienThoaiChinhHang> danhSachDienThoaiChinhHang = new ArrayList<>();
    private static List<DienThoaiXachTay> danhSachDienThoaiXachTay = new ArrayList<>();
    @Override
    public void themMoiDienThoaiChinhHang(DienThoaiChinhHang dienThoaiChinhHang) {
        danhSachDienThoai.add(dienThoaiChinhHang);
        danhSachDienThoaiChinhHang.add(dienThoaiChinhHang);
    }

    @Override
    public void themMoiDienThoaiXachTay(DienThoaiXachTay dienThoaiXachTay) {
        danhSachDienThoai.add(dienThoaiXachTay);
        danhSachDienThoaiXachTay.add(dienThoaiXachTay);
    }

    @Override
    public List<DienThoai> getAll() {
        return danhSachDienThoai;
    }

    @Override
    public List<DienThoaiChinhHang> getChinhHang() {
        return danhSachDienThoaiChinhHang;
    }

    @Override
    public List<DienThoaiXachTay> getXachTay() {
        return danhSachDienThoaiXachTay;
    }
}
