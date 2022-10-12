package Service;

import Model.DienThoai;
import Model.DienThoaiChinhHang;
import Model.DienThoaiXachTay;
import Repository.IPhoneRepository;
import Repository.PhoneRepositoryImp;

import java.io.PrintWriter;
import java.util.Scanner;

public class PhoneServiceImp implements IPhoneService {
    static int id = 0;
    public static Scanner scanner = new Scanner(System.in);
    public static IPhoneRepository iPhoneRepository = new PhoneRepositoryImp();

    @Override
    public void themMoiDienThoaiChinhHang() {
        DienThoaiChinhHang dienThoaiChinhHang = this.thongTinDienThoaiChinhHang();
        iPhoneRepository.themMoiDienThoaiChinhHang(dienThoaiChinhHang);
        try {
            PrintWriter pw = new PrintWriter("D:\\thuongvan23-A0522I1-VanTranHoaiThuong\\CODEGYM\\module_2\\FinalTest\\src\\Repository\\Data.text", "UTF-8");
            for (DienThoaiChinhHang dienThoai1 : iPhoneRepository.getChinhHang()){
                pw.print(dienThoai1.getTenDienThoai()+",");
                pw.print(dienThoai1.getGiaBan()+",");
                pw.print(dienThoai1.getSoLuong()+",");
                pw.print(dienThoai1.getNhaSanXuat()+",");
                pw.print(dienThoai1.getThoiGianBaoHanh()+",");
                pw.print(dienThoai1.getPhamViBaoHanh());
            }
            pw.println();
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void xoa() {
        System.out.print("Nhập ID điện thoại: ");
        int id = Integer.parseInt(scanner.nextLine());
        loop:
        while (true) {
            for (DienThoai dienThoai : iPhoneRepository.getAll()) {
                if (dienThoai.getId() == id) {
                    System.out.println("Are you sure (1.Yes or 2.No): ");
                    if (scanner.nextInt() == 1) {
                        iPhoneRepository.getAll().remove(dienThoai);
                        System.out.println("Remove success.");
                        break loop;
                    } else {
                        break;
                    }
                }
            }
            System.out.println("Điện thoại không tồn tại");
            break;
        }
        try {
            PrintWriter pw = new PrintWriter("D:\\thuongvan23-A0522I1-VanTranHoaiThuong\\CODEGYM\\module_2\\FinalTest\\src\\Repository\\Data.text", "UTF-8");
            for (DienThoaiChinhHang dienThoai1 : iPhoneRepository.getChinhHang()){
                pw.print(dienThoai1.getTenDienThoai()+",");
                pw.print(dienThoai1.getGiaBan()+",");
                pw.print(dienThoai1.getSoLuong()+",");
                pw.print(dienThoai1.getNhaSanXuat()+",");
                pw.print(dienThoai1.getThoiGianBaoHanh()+",");
                pw.print(dienThoai1.getPhamViBaoHanh());
            }
            pw.println();
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            PrintWriter pw = new PrintWriter("D:\\thuongvan23-A0522I1-VanTranHoaiThuong\\CODEGYM\\module_2\\FinalTest\\src\\Repository\\Data.text", "UTF-8");
            for (DienThoaiXachTay dienThoai1 : iPhoneRepository.getXachTay()){
                pw.print(dienThoai1.getTenDienThoai()+",");
                pw.print(dienThoai1.getGiaBan()+",");
                pw.print(dienThoai1.getSoLuong()+",");
                pw.print(dienThoai1.getNhaSanXuat()+",");
                pw.print(dienThoai1.getQuocGiaXachTay()+",");
                pw.print(dienThoai1.getTrangThai());
            }
            pw.println();
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void xemDanhSach() {
        for (DienThoai dienThoai : iPhoneRepository.getAll()) {
            System.out.println(dienThoai);
        }
    }

    @Override
    public void timKiem(){
        boolean flag = false;
        try {
            System.out.print("Nhập ID điện thoại: ");
            int id = Integer.parseInt(scanner.nextLine());
            for (DienThoai dienThoai : iPhoneRepository.getAll()) {
                if (id == dienThoai.getId()) {
                    flag = true;
                    System.out.println(dienThoai);
                    break;
                }
            }
            if (!flag){
                throw new NotFoundProductException();
            }
        } catch (NotFoundProductException e) {
            System.out.println("Không tìm thấy sản phẩm, vui vòng nhập lại...");
        }
    }

    @Override
    public void themMoiDienThoaiXachTay() {
        DienThoaiXachTay dienThoaiXachTay = this.thongTinDienThoaiXachTay();
        iPhoneRepository.themMoiDienThoaiXachTay(dienThoaiXachTay);
        try {
            PrintWriter pw = new PrintWriter("D:\\thuongvan23-A0522I1-VanTranHoaiThuong\\CODEGYM\\module_2\\FinalTest\\src\\Repository\\Data.text", "UTF-8");
            for (DienThoaiXachTay dienThoai1 : iPhoneRepository.getXachTay()){
                pw.print(dienThoai1.getTenDienThoai()+",");
                pw.print(dienThoai1.getGiaBan()+",");
                pw.print(dienThoai1.getSoLuong()+",");
                pw.print(dienThoai1.getNhaSanXuat()+",");
                pw.print(dienThoai1.getQuocGiaXachTay()+",");
                pw.print(dienThoai1.getTrangThai());
            }
            pw.println();
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private DienThoaiXachTay thongTinDienThoaiXachTay() {
        id += 1;
        System.out.print("Nhập tên điện thoại: ");
        String ten = scanner.nextLine();
        System.out.print("Nhập giá bán: ");
        int giaBan = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số lượng điện thoại: ");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên nhà sản xuất: ");
        String tenNhaSanXuat = scanner.nextLine();
        System.out.print("Quốc gia xách tay: ");
        String quocGia = scanner.nextLine();
        System.out.print("Trạng thái: ");
        String trangThai = scanner.nextLine();
        DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(id, ten, giaBan, soLuong, tenNhaSanXuat, quocGia, trangThai);
        return dienThoaiXachTay;
    }

    private DienThoaiChinhHang thongTinDienThoaiChinhHang() {
        id += 1;
        System.out.print("Nhập tên điện thoại: ");
        String ten = scanner.nextLine();
        System.out.print("Nhập giá bán: ");
        int giaBan = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số lượng điện thoại: ");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên nhà sản xuất: ");
        String tenNhaSanXuat = scanner.nextLine();
        System.out.print("Nhập thời gian bảo hành: ");
        String thoiGianBaoHanh = scanner.nextLine();
        System.out.print("Nhập phạm vi bảo hành: ");
        String phamViBaoHanh = scanner.nextLine();
        DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(id, ten, giaBan, soLuong, tenNhaSanXuat, thoiGianBaoHanh, phamViBaoHanh);
        return dienThoaiChinhHang;
    }
}
