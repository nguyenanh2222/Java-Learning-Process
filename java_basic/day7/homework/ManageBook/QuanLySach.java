package lesson5.baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    private final static ArrayList<TaiLieu> danhSachTaiLieu = new ArrayList<>();



    public static ArrayList<TaiLieu> getDanhSachTaiLieu(){
        return danhSachTaiLieu;
    }
    /**
     *
     * @param scanner
     * @return t
     */
    public TaiLieu themMoiTaiLieu(Scanner scanner) {
        TaiLieu taiLieu = null;
        int nhap = 0;
        System.out.println("Nhập 1 để thêm Sách");
        System.out.println("Nhập 2 để thêm Báo");
        System.out.println("Nhập 3 để thêm Tạp chí");
        nhap = scanner.nextInt();scanner.nextLine();
        while (nhap > 3 || nhap < 1) {
            System.out.println("Nhập lại từ 1 đến 3");
            nhap = scanner.nextInt();scanner.nextLine();
        }
        if (nhap == 1) taiLieu = new Sach();
        else if (nhap == 2) taiLieu = new Bao();
        else taiLieu = new TapChi();
        taiLieu.nhapThongTin(scanner);
        FileUtils.luuDanhSachTaiLieu();
        return taiLieu;
    }

    public TaiLieu xoaTaiLieu(Scanner scanner) {
        System.out.println("Nhập mã tài liệu cần xóa");
        String maTaiLieu = scanner.nextLine();
        TaiLieu tl = new TaiLieu();
        tl.setMaTaiLieu(maTaiLieu);
        if (!danhSachTaiLieu.contains(tl)){
            System.out.println("Không tồn tại mã tài liệu cần xóa");
            return null;
        } else {
            danhSachTaiLieu.remove(tl);
            FileUtils.luuDanhSachTaiLieu();
        }
        return tl;
    }
    public void hienThiDanhSach(Scanner scanner) {
        System.out.println("Nhập cụm từ cần tìm kiếm (all nếu hiển thị tất cả)");
        String maTaiLieu = scanner.nextLine();
        for (TaiLieu tl: danhSachTaiLieu
             ) {
            if ("all".equalsIgnoreCase(maTaiLieu)
                    || tl.getMaTaiLieu().contains(maTaiLieu)) {
                System.out.println(tl.info());
            }
        }
    }
}
