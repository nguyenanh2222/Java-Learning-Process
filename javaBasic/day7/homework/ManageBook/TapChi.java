package lesson5.baitap;

import java.util.Scanner;

public class TapChi extends TaiLieu {
    private int soPhathanh;
    private int thangPhatHanh;

    @Override
    public void nhapThongTin(Scanner scanner) {
        loaiTaiLieu = LoaiTaiLieu.TAP_CHI;
        super.nhapThongTin(scanner);
        System.out.print("Nhập thông tin số phat hành: ");
        this.soPhathanh = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập thông tin tháng phát hành: ");
        this.thangPhatHanh = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public String info() {
        StringBuilder builder = new StringBuilder(super.info());
        builder.append(", Số phát hành: ").append(soPhathanh)
                .append(", Tháng phát hành: ").append(thangPhatHanh);
        return builder.toString();
    }

    public int getSoPhathanh() {
        return soPhathanh;
    }

    public void setSoPhathanh(int soPhathanh) {
        this.soPhathanh = soPhathanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }
}
