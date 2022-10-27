package lesson5.baitap;

import lesson5.baitap.*;

import java.io.*;
import java.util.ArrayList;

public class FileUtils {
    public static void luuDanhSachTaiLieuTheoDuongDan(ArrayList taiLieus, String path) {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //Bước 2: Ghi mảng đối tượng vào file
            oos.writeObject(taiLieus);
            //Bước 3: Đóng luồng
            fos.close();
            oos.close();
        } catch (IOException ex) {
            System.out.println("Loi ghi file: " + ex);
        }
    }

    public static ArrayList docDanhSachTaiLieuTheoDuongDan(String path) {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            //Bước 2: Đọc dữ liệu
            ArrayList result = (ArrayList) ois.readObject();
            //Bước 3: Đóng luồng
            fis.close();
            ois.close();
            return result;
        } catch (Exception ex) {
            System.out.println("Loi doc file: "+ex);
        }
        return null;
    }

    static final String SACH_PATH = "D:\\opt\\data\\2208\\sach.bin";
    static final String BAO_PATH = "D:\\opt\\data\\2208\\bao.bin";
    static final String TAP_CHI_PATH = "D:\\opt\\data\\2208\\tap_chi.bin";
    public static void luuDanhSachTaiLieu() {
        ArrayList<TaiLieu> taiLieus = QuanLySach.getDanhSachTaiLieu();
        if (taiLieus == null || taiLieus.size() == 0) return;

        ArrayList<Sach> saches = new ArrayList<>();
        ArrayList<Bao> baos = new ArrayList<>();
        ArrayList<TapChi> tapChis = new ArrayList<>();
        for (int i = 0; i < taiLieus.size(); i++) {
            if (taiLieus.get(i).getLoaiTaiLieu().equals(LoaiTaiLieu.SACH))
                saches.add((Sach)taiLieus.get(i));
            if (taiLieus.get(i).getLoaiTaiLieu().equals(LoaiTaiLieu.BAO))
                baos.add((Bao) taiLieus.get(i));
            if (taiLieus.get(i).getLoaiTaiLieu().equals(LoaiTaiLieu.TAP_CHI))
                tapChis.add((TapChi) taiLieus.get(i));
        }

        luuDanhSachTaiLieuTheoDuongDan(saches, SACH_PATH);
        luuDanhSachTaiLieuTheoDuongDan(baos, BAO_PATH);
        luuDanhSachTaiLieuTheoDuongDan(tapChis, TAP_CHI_PATH);
    }

    public static ArrayList<TaiLieu> docDanhSachTaiLieu() {
        ArrayList<Sach> saches = (ArrayList<Sach>) docDanhSachTaiLieuTheoDuongDan(SACH_PATH);
        ArrayList<Bao> baos = (ArrayList<Bao>) docDanhSachTaiLieuTheoDuongDan(BAO_PATH);
        ArrayList<TapChi> tapChis = (ArrayList<TapChi>) docDanhSachTaiLieuTheoDuongDan(TAP_CHI_PATH);
        ArrayList<TaiLieu> taiLieus = new ArrayList<>();
        if (saches != null)
            taiLieus.addAll(saches);
        if (baos != null)
            taiLieus.addAll(baos);
        if (tapChis != null)
            taiLieus.addAll(tapChis);
        return taiLieus;
    }


}
