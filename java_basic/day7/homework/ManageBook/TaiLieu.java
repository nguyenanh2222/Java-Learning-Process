package lesson5.baitap;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class TaiLieu implements Serializable {
    private String maTaiLieu;
    private String nhaXuatBan;
    private int soPhatHanh;

    protected LoaiTaiLieu loaiTaiLieu;

    public TaiLieu() {
    }

    public TaiLieu(String maTaiLieu, String nhaXuatBan, int soPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
        this.soPhatHanh = soPhatHanh;
    }

    public void nhapThongTin(Scanner scanner) {
        System.out.print("Nhập thông tin mã tài liệu: ");
        this.maTaiLieu = scanner.nextLine();
        while (QuanLySach.getDanhSachTaiLieu().contains(this)){
            System.out.print("Nhập lại thông tin mã tài liệu: ");
            this.maTaiLieu = scanner.nextLine();
        }
        QuanLySach.getDanhSachTaiLieu().add(this);
        System.out.print("Nhập thông tin nhà xuất bản: ");
        this.nhaXuatBan = scanner.nextLine();
        System.out.print("Nhập thông tin số phát hành: ");
        this.soPhatHanh = scanner.nextInt(); scanner.nextLine();
    }
    public String info(){
        StringBuilder builder = new StringBuilder();// cộng chuỗi
        builder.append("Mã: ").append(maTaiLieu)
                .append(", NXB: ").append(nhaXuatBan)
                .append(", Số PH: ").append(soPhatHanh);
        return builder.toString();
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }
    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }
    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }
    public int getSoPhatHanh() {
        return soPhatHanh;
    }
    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public LoaiTaiLieu getLoaiTaiLieu() {
        return loaiTaiLieu;
    }

    public void setLoaiTaiLieu(LoaiTaiLieu loaiTaiLieu) {
        this.loaiTaiLieu = loaiTaiLieu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;// so sánh về địa chỉ
        if (o == null ) return false;
        TaiLieu taiLieu = (TaiLieu) o;
        return Objects.equals(maTaiLieu, taiLieu.maTaiLieu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maTaiLieu);
    }
}
