import org.jetbrains.annotations.Nullable;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ReadWriteObject {

    public void write(Object obj, String filePath){
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;
        try {
            fout = new FileOutputStream(filePath);
            oos = new ObjectOutputStream(fout);
            oos.writeObject(obj);
            System.out.println("Xong!");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
        // đọc object từ file
    public File update(@Nullable Object objOld, Object objNew, String filePath, String filePathTemp) throws IOException {
        FileOutputStream fosTemp = new FileOutputStream(filePathTemp);
        ObjectOutputStream oosTemp = new ObjectOutputStream(fosTemp);
        FileInputStream fis = new FileInputStream(filePath);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            if (objOld == null) {
                oosTemp.writeObject(objNew);
            }
            Object obj;
            while (ois.read()==-1) {
                obj = ois.readObject();
                assert objOld != null;
                if (obj.hashCode() != objOld.hashCode()) {
                    oosTemp.writeObject(obj);
                } else if (obj.hashCode() == objOld.hashCode()) {
                    oosTemp.writeObject(objNew);
                    System.out.printf("Sửa tài liệu xong, %s\n --> %s\n", obj.toString(), objNew.toString());
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                fosTemp.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File newfile = null;
        try {
            File oldfile = new File(filePath);
            newfile = new File(filePathTemp);
            if (oldfile.delete()) {
                System.out.println(oldfile.getName() + " is deleted!");
            } else {
                System.out.println("Delete operation is failed.");
            }
            if (newfile.renameTo(oldfile)) {
                System.out.println("Rename succesful");
            } else {
                System.out.println("Rename failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return newfile;
    }

    public File delete(Object objOld, String filePath, String filePathTemp) throws IOException {
        FileOutputStream fosTemp = new FileOutputStream(filePathTemp);
        ObjectOutputStream oosTemp = new ObjectOutputStream(fosTemp);
        FileInputStream fis = new FileInputStream(filePath);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            Object obj;
            while (ois.read()==-1) {
                obj = ois.readObject();
                if (obj.hashCode() != objOld.hashCode()) {
                    oosTemp.writeObject(obj);
                }
                if (obj.hashCode() == objOld.hashCode()) {
                    System.out.printf("Xóa tài liệu xong, %s\n", obj.toString());
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                fosTemp.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File newfile = null;
        try {
            File oldfile = new File(filePath);
            newfile = new File(filePathTemp);
            if (oldfile.delete()) {
                System.out.println(oldfile.getName() + " is deleted!");
            } else {
                System.out.println("Delete operation is failed.");
            }
            if (newfile.renameTo(oldfile)) {
                System.out.println("Rename succesful");
            } else {
                System.out.println("Rename failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return newfile;
    }

    public List<Object> displayFile(String filePath) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Object> listObj = new ArrayList<>();
        try {
            Object obj;
            while ((obj =ois.readObject()) != null) {
                listObj.add(obj);
        }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listObj;
    }

    // kiểm tra file có object lưu vào hay chưa
    public boolean hasObject(String filePath) {
        FileInputStream fi;
        boolean check = true;
        try {
            fi = new FileInputStream(filePath);
            ObjectInputStream inStream = new ObjectInputStream(fi);
            if ((inStream.readObject()) == null) {
                check = false;
            }
            inStream.close();
        } catch (IOException e) {
            check = false;
        } catch (ClassNotFoundException e) {
            check = false;
            e.printStackTrace();
        }
        return check;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException {
//        TaiLieu taiLieu = new TaiLieu();
        ReadWriteObject readWriteObject = new ReadWriteObject();
        DateFormat launchDayTapChi = new SimpleDateFormat("dd/MM/yyyy");
    Date stringLaunchDayTapChi = launchDayTapChi.parse("21/03/2000");
    TapChi tapChi1 = new TapChi(123, "Kim Đồng",  "nguyen", 1500, stringLaunchDayTapChi, 123);
    TapChi tapChi2 = new TapChi(122, "NXB Tre",  "NGUYEN", 1500, stringLaunchDayTapChi, 123);
    TapChi tapChi3 = new TapChi(122, "NXB ODDDD",  "QQQQQQQQQQQQ", 1500, stringLaunchDayTapChi, 123);
    TapChi tapChi4 = new TapChi(122, "NXB )))))))",  ")))))))))0", 1500, stringLaunchDayTapChi, 123);

    readWriteObject.write(tapChi1, Constants.PATHTAPCHI);
    readWriteObject.write(tapChi2, Constants.PATHTAPCHI);
    readWriteObject.write(tapChi3, Constants.PATHTAPCHI);
//    readWriteObject.update(tapChi3, tapChi4, Constants.PATHTAPCHI, Constants.PATHTAPCHIUPDATE);
//    readWriteObject.delete(tapChi3, Constants.PATHTAPCHI, Constants.PATHTAPCHIUPDATE);
    System.out.println(readWriteObject.displayFile(Constants.PATHTAPCHI));


//        taiLieu.themMoi(Type.TAPCHI,null, null, tapChi1);
//        taiLieu.themMoi(Type.TAPCHI, null, null, tapChi2);
//        taiLieu.suaTaiLieu(Type.TAPCHI, null, null, tapChi3);
//        taiLieu.xoaTaiLieu(Type.TAPCHI, null, null, tapChi3);
//        System.out.println(taiLieu.xemList(Type.TAPCHI));



//        taiLieu.timKiemTapChiTheoMa("S122");
//        taiLieu.timKiemTapChiTheonhaXuatBan("NXB Tre");
//        taiLieu.timKiemTapChiTheoSoPhatHanh(123);
//        taiLieu.timKiemTapChiTheoTacGia("nguyen");
//        System.out.println(taiLieu.timKiemTapChiTheoMa("S122"));
}

}

