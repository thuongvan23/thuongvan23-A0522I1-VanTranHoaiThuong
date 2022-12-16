package Controller;

import java.util.Date;

public class BenhNhan {
    private String ma_benh_nhan;
    private String ma_benh_an;
    private String ten;
    private Date ngay_nhap_vien;
    private Date ngay_ra_vien;
    private String li_do_nhap_vien;

    public BenhNhan() {
    }

    public BenhNhan(String ma_benh_nhan, String ma_benh_an, String ten, Date ngay_nhap_vien, Date ngay_ra_vien, String li_do_nhap_vien) {
        this.ma_benh_nhan = ma_benh_nhan;
        this.ma_benh_an = ma_benh_an;
        this.ten = ten;
        this.ngay_nhap_vien = ngay_nhap_vien;
        this.ngay_ra_vien = ngay_ra_vien;
        this.li_do_nhap_vien = li_do_nhap_vien;
    }

    public String getMa_benh_nhan() {
        return ma_benh_nhan;
    }

    public void setMa_benh_nhan(String ma_benh_nhan) {
        this.ma_benh_nhan = ma_benh_nhan;
    }

    public String getMa_benh_an() {
        return ma_benh_an;
    }

    public void setMa_benh_an(String ma_benh_an) {
        this.ma_benh_an = ma_benh_an;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgay_nhap_vien() {
        return ngay_nhap_vien;
    }

    public void setNgay_nhap_vien(Date ngay_nhap_vien) {
        this.ngay_nhap_vien = ngay_nhap_vien;
    }

    public Date getNgay_ra_vien() {
        return ngay_ra_vien;
    }

    public void setNgay_ra_vien(Date ngay_ra_vien) {
        this.ngay_ra_vien = ngay_ra_vien;
    }

    public String getLi_do_nhap_vien() {
        return li_do_nhap_vien;
    }

    public void setLi_do_nhap_vien(String li_do_nhap_vien) {
        this.li_do_nhap_vien = li_do_nhap_vien;
    }
}
