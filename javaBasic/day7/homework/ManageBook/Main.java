package lesson5.baitap;

import java.util.Scanner;

public class Main {
    static {
        System.out.println("start");
        QuanLySach.getDanhSachTaiLieu().addAll(FileUtils.docDanhSachTaiLieu());
        System.out.println("end");
    }

    private static String bienSo;

    // class static
    // là calss bình thường
    static class StaticExample{
        String a;
    }

    // hàm chạy ctrinh chính
    public static void main(String[] args) {
//        Main.StaticExample
        bienSo = "t3h";
        Scanner scanner = new Scanner(System.in);
        QuanLySach quanLySach = new QuanLySach();
//        quanLySach.danhSachTaiLieu
        Main2 main2 = new Main2();
        main2.themTaiLieu();

//        QuanLySach.danhSachTaiLieu;// danh sách tài liệu

//        int x = 19;
//        x = 0;
//        System.out.println("10/x = " + 10/x );

        int input = -1;
        while (input != 0) {
            System.out.println("===== MENU ===========");
            System.out.println("Gõ 1 để thêm mới tài liệu");
            System.out.println("Gõ 2 để xóa tài liệu");
            System.out.println("Gõ 3 để tìm kiếm tài liệu");
            System.out.println("Gõ 0 để thoát");
            input = scanner.nextInt();
            scanner.nextLine();
            while (input > 3 || input < 0) {
                System.out.print("Nhập lại từ 0 đến 3 ");
                input = scanner.nextInt();
                scanner.nextLine();
            }
            if (input == 1) quanLySach.themMoiTaiLieu(scanner);
            else if (input == 2) quanLySach.xoaTaiLieu(scanner);
            else if (input == 3) quanLySach.hienThiDanhSach(scanner);
            else break;
        }


//        System.out.println("Bài tập buổi 5");
//        TaiLieu tl_1 = new TaiLieu("1234", "Kim đồng", 123);
//        TaiLieu tl_2 = new TaiLieu("1234", "Kim đồng", 123);
//        TaiLieu tl_3 = tl_1;
//        System.out.println("Nhà xuất bản tl_1 là lần 1: " + tl_1.getNhaXuatBan());
//        tl_3.setNhaXuatBan("Lao động");
//        System.out.println("Nhà xuất bản tl_1 là lần 2: " + tl_1.getNhaXuatBan());
//        ArrayList<TaiLieu> danhSachTaiLieu = new ArrayList();
//        danhSachTaiLieu.add(tl_1);
        // Để so sánh 2 đối tượng thì sử dụng hàm equals
        // Làm thế nào để sử dụng được hàm equals


//        danhSachTaiLieu.add(tl_2);
//        if (tl_1.getMaTaiLieu().equals(tl_2.getMaTaiLieu())) {
//            System.out.println("Tài liệu trùng mã");
//        } else {
//            System.out.println("Tài liệu khác mã");
//        }
//        for (int i = 0; i < danhSachTaiLieu.size(); i++) {
//            if (danhSachTaiLieu.get(i).getMaTaiLieu().equals(tl_2.getMaTaiLieu())) {
//                System.out.println("Danh sách Tài liệu trùng mã");
//                break;
//            }
//        }
//        if (tl_1.equals(tl_2)) {
//            System.out.println("tl_1 bằng tl_2");
//        } else {
//            System.out.println("tl_1 không bằng tl_2");
//        }
//        if (danhSachTaiLieu.contains(tl_2)) {
//            System.out.println("danh sách chứa mã tl_2");
//        } else {
//            System.out.println("danh sách không chứa mã tl_2");
//        }

    }
}
