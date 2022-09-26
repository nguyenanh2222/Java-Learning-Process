import java.io.*;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

//BÀI 1
//        Một thư viện cần quản lý các tài liệu bao gồm Sách, Tạp chí, Báo. Mỗi
//        tài liệu gồm có các thuộc tính sau: Mã tài liệu(Mã tài liệu là duy nhất),
//        Tên nhà xuất bản, số bản phát hành.
//        Các loại sách cần quản lý thêm các thuộc tính: tên tác giả, số trang.
//        Các tạp chí cần quản lý thêm: Số phát hành, tháng phát hành.
//        Các báo cần quản lý thêm: Ngày phát hành.
//        Yêu cầu 1: Xây dựng các lớp để quản lý tài liệu cho thư viện một cách
//        hiệu quả.
//        Yêu cầu 2: Xây dựng lớp QuanLySach có các chức năng sau
//        Thêm mới tài liêu: Sách, tạp chí, báo.
//        Xoá tài liệu theo mã tài liệu.
//        Hiện thị thông tin về tài liệu.
//        Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.
//        Thoát khỏi chương trình.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException {
        TaiLieu taiLieu = new TaiLieu();

//        Sach objOld = new Sach(127, "NXB Amun", "Tiktikzuki", 1500);
//        Sach objNew = new Sach(127, "NXB Đinh Tị", "Jennifer O’Connell", 1500,);
//        Sach sach1 = new Sach(123, "Kim Đồng", "nguyen", 1500);
//        Sach sach2 = new Sach(122, "NXB Tre", "nguyen", 1500);
////
//        taiLieu.themMoi(Type.SACH, sach1, null, null);
//        taiLieu.themMoi(Type.SACH, sach2, null, null);
//        taiLieu.themMoi(Type.SACH, objOld, null, null);
//        taiLieu.themMoi(Type.SACH, objNew, null, null);
//        taiLieu.suaTaiLieu(Type.SACH, objNew, null, null);
//        taiLieu.xoaTaiLieu(Type.SACH, sach1, null, null);
//        taiLieu.xemList(null);
////
//        taiLieu.timKiemSachTheoMa(122);
//        taiLieu.timKiemSachTheonhaXuatBan("NXB Tre");
//        taiLieu.timKiemSachTheoMa(122);
//
//        DateFormat launchDay = new SimpleDateFormat("dd/MM/yyyy");
//        Date stringlaunchDay = launchDay.parse("21/03/2000");
//        Bao bao1 = new Bao(123, "Kim Đồng",  "nguyen", 1500, stringlaunchDay);
//        Bao bao2 = new Bao(122, "NXB Tre",  "nguyen", 1500,stringlaunchDay);
//        Bao bao3 = new Bao(122, "NXB Tre",  "J.K.Rowling", 1500,stringlaunchDay);
//
//        taiLieu.themMoi(Type.BAO,null, bao1, null);
//        taiLieu.themMoi(Type.BAO, null, bao2, null);
//        taiLieu.suaTaiLieu(Type.BAO, null, bao3, null);
//        taiLieu.xoaTaiLieu(Type.BAO, null, bao3, null);
//        taiLieu.xemList(Type.BAO);
//
//        taiLieu.timKiemBaoTheoMa(122);
//        taiLieu.timKiemBaoTheonhaXuatBan("NXB Tre");
//        taiLieu.timKiemBaoTheoTacGia("nguyen");
//        System.out.println(taiLieu.timKiemBaoTheoMa(122));
//
        DateFormat launchDayTapChi = new SimpleDateFormat("dd/MM/yyyy");
        Date stringLaunchDayTapChi = launchDayTapChi.parse("21/03/2000");
        TapChi tapChi1 = new TapChi(123, "Kim Đồng",  "nguyen", 1500, stringLaunchDayTapChi, 123);
        TapChi tapChi2 = new TapChi(122, "NXB Tre",  "NGUYEN", 1500, stringLaunchDayTapChi, 123);
        TapChi tapChi3 = new TapChi(122, "NXB ODDDD",  "QQQQQQQQQQQQ", 1500, stringLaunchDayTapChi, 123);

        taiLieu.themMoi(Type.TAPCHI,null, null, tapChi1);
        taiLieu.themMoi(Type.TAPCHI, null, null, tapChi2);
        System.out.println(taiLieu.themMoi(Type.TAPCHI, null, null, tapChi2));

//        taiLieu.suaTaiLieu(Type.TAPCHI, null, null, tapChi3);
//        taiLieu.xoaTaiLieu(Type.TAPCHI, null, null, tapChi3);
        System.out.println(taiLieu.xemList(Type.TAPCHI));

//        taiLieu.timKiemTapChiTheoMa("S122");
//        taiLieu.timKiemTapChiTheonhaXuatBan("NXB Tre");
//        taiLieu.timKiemTapChiTheoSoPhatHanh(123);
//        taiLieu.timKiemTapChiTheoTacGia("nguyen");
//        System.out.println(taiLieu.timKiemTapChiTheoMa("S122"));
    }
}



