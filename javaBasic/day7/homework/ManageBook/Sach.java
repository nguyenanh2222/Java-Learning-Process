package lesson5.baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;

    @Override
    public void nhapThongTin(Scanner scanner) {
        loaiTaiLieu = LoaiTaiLieu.SACH;
        super.nhapThongTin(scanner);
        System.out.print("Nhập thông tin tên tác giả: ");
        this.tenTacGia = scanner.nextLine();
        System.out.print("Nhập thông tin số trang: ");
        this.soTrang = scanner.nextInt(); scanner.nextLine();
    }

    @Override
    public String info() {
        StringBuilder builder = new StringBuilder(super.info());
        builder.append(", Tên TG: ").append(tenTacGia)
                .append(", số trang: ").append(soTrang);
        return builder.toString();
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
}
