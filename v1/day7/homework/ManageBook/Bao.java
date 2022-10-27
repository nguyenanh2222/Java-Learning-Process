package lesson5.baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class Bao extends TaiLieu {
    private String ngayPhatHanh;

    @Override
    public void nhapThongTin(Scanner scanner) {
        loaiTaiLieu = LoaiTaiLieu.BAO;
        super.nhapThongTin(scanner);
        System.out.print("Nhập thông tin ngày phát hành: ");
        this.ngayPhatHanh = scanner.nextLine();
    }

    @Override
    public String info() {
        StringBuilder builder = new StringBuilder(super.info());
        builder.append(", Ngày PH : ").append(ngayPhatHanh);
        return builder.toString();
    }
    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
}
