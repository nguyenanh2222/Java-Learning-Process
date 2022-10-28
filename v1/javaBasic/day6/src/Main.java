import congnhan.CongNhan;
import kysu.KySu;
import nhanvien.NhanVien;
import qlcb.QLCB;
//Bài 3.Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên.
//        + Mỗi cán bộ cần quản lý lý các thuộc tính: Họ tên, năm sinh, giới tính, địa
//        chỉ
//        + Các công nhân cần quản lý: Bậc
//        + Các kỹ sư cần quản lý: Ngành đào tạo, loại bằng
//        + Các nhân viên phục vụ cần quản lý thông tin: công việc
//        1. Xây dựng các lớp NhanVien, CongNhan, KySu kế thừa từ lớp CanBo
//        2. Xây dựng các hàm để truy nhập, hiển thị thông tin và kiểm tra về các
//        thuộc tính của các lớp.
//        3. Xây dựng lớp QLCB cài đặt các phương thức thực hiện các chức năng sau:
//        - Nhập thông tin mới cho cán bộ
//        - Tìm kiếm theo họ tên
//        - Hiển thị thông tin về danh sách các cán bộ
//        - Thoát khỏi chương
public class Main {
    public static void main(String[] args) {
        QLCB qlcb = new QLCB();
        qlcb.insertInfo("Nguyễn Quản Lý", 1998, "nữ", "quận 10");
        qlcb.searchInfo("Nguyễn Quản Lý");
        qlcb.showListInfo();
//        System.out.print(qlcb.searchInfo("Nguyễn Quản Lý"));
        System.out.print(qlcb.showListInfo());

        NhanVien nhanVien = new NhanVien();
        nhanVien.insertInfo("Nguyễn Nhân Viên", 1998, "nữ", "quận 10", "thu ngân");
        nhanVien.searchInfo("Nguyễn Nhân Viên");
        nhanVien.showListInfo();

        CongNhan congNhan = new CongNhan();
        congNhan.insertInfo("Nguyễn Công Nhân", 1998, "nữ", "quận 10", "bậc 1");
        congNhan.searchInfo("Nguyễn Công Nhân");
        congNhan.showListInfo();

        KySu kySu = new KySu();
        kySu.insertInfo("Nguyễn Kỹ Sư", 1998, "nữ", "quận 10", "chuyên ngành CNTT", "bằng kỹ sư");
        kySu.searchInfo("Nguyễn Kỹ Sư");
        kySu.showListInfo();
    }
}