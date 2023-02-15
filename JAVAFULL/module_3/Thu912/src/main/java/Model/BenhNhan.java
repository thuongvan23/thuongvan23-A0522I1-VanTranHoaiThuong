package Model;

import java.util.Date;

public class BenhNhan {
    private String ma_benh_nhan;
    private String ten;
    private Date ngay_nhap_vien;
    private Date ngay_ra_vien;
    private String li_do_nhap_vien;
    private BenhAn benh_an;

    public BenhNhan() {
    }

    public BenhNhan(String ma_benh_nhan, String ten, Date ngay_nhap_vien, Date ngay_ra_vien, String li_do_nhap_vien, BenhAn benh_an) {
        this.ma_benh_nhan = ma_benh_nhan;
        this.ten = ten;
        this.ngay_nhap_vien = ngay_nhap_vien;
        this.ngay_ra_vien = ngay_ra_vien;
        this.li_do_nhap_vien = li_do_nhap_vien;
        this.benh_an = benh_an;
    }

    public String getMa_benh_nhan() {
        return ma_benh_nhan;
    }

    public void setMa_benh_nhan(String ma_benh_nhan) {
        this.ma_benh_nhan = ma_benh_nhan;
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

    public BenhAn getBenh_an() {
        return benh_an;
    }

    public void setBenh_an(BenhAn benh_an) {
        this.benh_an = benh_an;
    }
}
