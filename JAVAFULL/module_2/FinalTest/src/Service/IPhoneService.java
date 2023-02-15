package Service;

public interface IPhoneService {
    void themMoiDienThoaiChinhHang();
    void xoa();
    void xemDanhSach();
    void timKiem() throws NotFoundProductException;
    void themMoiDienThoaiXachTay();
}
