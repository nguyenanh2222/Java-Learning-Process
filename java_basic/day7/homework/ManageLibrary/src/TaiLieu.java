import org.jetbrains.annotations.Nullable;

import java.io.*;
import java.util.*;

public class TaiLieu {
    private final List<Sach> sachs;
    private final List<Bao> baos;
    private final List<TapChi> tapChis;

    @Override
    public String toString() {
        return "TaiLieu{" +
                "sachs=" + sachs +
                ", baos=" + baos +
                ", tapChis=" + tapChis +
//                ", type=" + type +
                '}';
    }
    public TaiLieu(){
        this.baos = new ArrayList<>();
        this.tapChis = new ArrayList<>();
        this.sachs = new ArrayList<>();
    }
    public boolean themMoi(Type type, @Nullable Sach sach, @Nullable Bao bao, @Nullable TapChi tapChi) throws IOException {
        switch (type) {
            case SACH -> {
                if(this.sachs.isEmpty()){
                    this.sachs.add(sach);
                    ReadWriteObject obj = new ReadWriteObject();
                    obj.write(sach, Constants.PATHSACH);
                    return true;
                }
                for (Sach sachCheck : this.sachs) {
                    if (sachCheck.ma == sach.ma) {
                        return false;
                    } else {
                        this.sachs.add(sach);
                        ReadWriteObject obj = new ReadWriteObject();
                        obj.write(sach, Constants.PATHSACH);
                        return true;
                    }
                }
            }
            case BAO -> {
                if(this.baos.isEmpty()){
                    this.baos.add(bao);
                    ReadWriteObject obj = new ReadWriteObject();
                    obj.write(bao, Constants.PATHBAO);
                    return true;
                }
                for (Bao baoCheck : this.baos) {
                    if (baoCheck.ma == bao.ma) {
                        return false;
                    }else{
                        this.baos.add(bao
                        );
                        ReadWriteObject obj = new ReadWriteObject();
                        obj.write(bao, Constants.PATHBAO);
                        return true;
                    }
                }
            }
            case TAPCHI -> {
                if(this.tapChis.isEmpty()){
                    this.tapChis.add(tapChi);
                    ReadWriteObject obj = new ReadWriteObject();
                    obj.write(tapChi, Constants.PATHTAPCHI);
                    return true;
                }
                for (TapChi tapChiCheck : this.tapChis) {
                    System.out.println(tapChiCheck.ma);
                    System.out.println(tapChi.ma);
                    if (tapChiCheck.ma == tapChi.ma) {
                        return false;
                    }else{
                        this.tapChis.add(tapChi);
                        ReadWriteObject obj = new ReadWriteObject();
                        obj.write(tapChi, Constants.PATHTAPCHI);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean suaTaiLieu(Type type, @Nullable Sach sach, @Nullable Bao bao, @Nullable TapChi tapChi) throws IOException, ClassNotFoundException {
        switch (type) {
            case SACH -> {
                for (Sach sachCheck : this.sachs) {
                    if (sachCheck.ma == sach.ma) {
                        this.sachs.remove(sach);
                        ReadWriteObject obj = new ReadWriteObject();
                        obj.update(sachCheck, sach, Constants.PATHSACH, Constants.PATHSACHUPDATE);
                return true;
            }
        }
            }
            case BAO -> {
            for (Bao baoCheck : this.baos) {
                if (baoCheck.ma == bao.ma) {
                    ReadWriteObject obj = new ReadWriteObject();
                    obj.update(baoCheck, bao, Constants.PATHBAO, Constants.PATHBAOUPDATE);
                    this.baos.remove(bao);
                    return true;
            }
        }
            }
            case TAPCHI -> {
            for (TapChi tapChiCheck : this.tapChis) {
                if (tapChiCheck.ma == tapChi.ma) {
                    this.tapChis.remove(tapChi);
                    ReadWriteObject obj = new ReadWriteObject();
                    obj.update(tapChiCheck, tapChi, Constants.PATHTAPCHI, Constants.PATHTAPCHIUPDATE);
                    return true;
            }
        }
        }
        }
        return false;
        }

    public boolean xoaTaiLieu(Type type, @Nullable Sach sach, @Nullable Bao bao, @Nullable TapChi tapChi) throws IOException {
        switch (type) {
            case SACH -> {
                for (Sach sachCheck : this.sachs) {
                    if (sachCheck.ma == sach.ma) {
                        this.sachs.remove(sach);
                        ReadWriteObject obj = new ReadWriteObject();
                        obj.delete(sach, Constants.PATHSACH, Constants.PATHTAPCHIUPDATE);
                        return true;
            }
        }
    }
            case BAO -> {
                System.out.println(bao);
                for (Bao baoCheck : this.baos) {
                    System.out.println(this.baos);
                    if (baoCheck.ma == bao.ma) {
                        System.out.println(this.baos);
                        ReadWriteObject obj = new ReadWriteObject();
                        obj.delete(bao, Constants.PATHBAO, Constants.PATHBAOUPDATE);
                        this.baos.remove(bao);
                        return true;
            }
        }
        }
            case TAPCHI -> {
                for (TapChi tapChiCheck : this.tapChis) {

                    System.out.println("++++++++++++++++=");
                    System.out.println(tapChiCheck.ma);
                    System.out.println(tapChi.ma);

                    if (tapChiCheck.ma == tapChi.ma) {
                        System.out.println("++++++++++++++++=");

                        ReadWriteObject obj = new ReadWriteObject();
                        obj.delete(tapChi, Constants.PATHTAPCHI, Constants.PATHTAPCHIUPDATE);
                        System.out.println("++++++++++++++++=");
                        this.tapChis.remove(tapChi);
                        return true;
                }
            }
        }
        }
            return false;
        }
    public List<Object> xemList(@Nullable Type type) throws IOException {
        List<Object> arrayList= new ArrayList<Object>();
        if (type == null) {
            ReadWriteObject obj = new ReadWriteObject();
            arrayList.add(obj.displayFile(Constants.PATHSACH));
            arrayList.add(obj.displayFile(Constants.PATHBAO));
            arrayList.add(obj.displayFile(Constants.PATHTAPCHI));
            return arrayList;
        }
        switch (Objects.requireNonNull(type)) {
            case SACH -> {
                ReadWriteObject obj = new ReadWriteObject();
                obj.displayFile(Constants.PATHSACH);
                arrayList.add(obj.displayFile(Constants.PATHSACH));
            }
            case BAO -> {
                ReadWriteObject obj = new ReadWriteObject();
                obj.displayFile(Constants.PATHBAO);
                arrayList.add(obj.displayFile(Constants.PATHBAO));
            }
            case TAPCHI -> {
                ReadWriteObject obj = new ReadWriteObject();
                obj.displayFile(Constants.PATHTAPCHI);
                arrayList.add(obj.displayFile(Constants.PATHTAPCHI));
            }
        }
        return arrayList;
    }

    public Sach timKiemSachTheoMa(Integer ma) {
        if (this.sachs.isEmpty()) {
            return null;
        } else {
            for (Sach sachCheck : this.sachs) {
                if (sachCheck.ma == ma) {
                    return sachCheck;
        }
    }
        }
        return null;
    }
    public Sach timKiemSachTheoTacGia(String tacgia) {
        if (this.sachs.isEmpty()) {
            return null;
        } else {
            for (Sach sachCheck : this.sachs) {
                if (sachCheck.tenTacGia == tacgia) {
                    return sachCheck;
                }
            }
        }
        return null;
    }
    public Sach timKiemSachTheonhaXuatBan(String nhaXuatBan) {
        if (this.sachs.isEmpty()) {
            return null;
        } else {
            for (Sach sachCheck : this.sachs) {
                if (sachCheck.nhaXuatBan == nhaXuatBan) {
                    return sachCheck;
                }
            }
        }
        return null;
    }
    public Bao timKiemBaoTheoMa(Integer ma) {
        if (this.baos.isEmpty()) {
            return null;
        } else {
            for (Bao baoCheck : this.baos) {
                if (baoCheck.ma == ma) {
                    return baoCheck;
                }
            }
        }
        return null;
    }
    public Bao timKiemBaoTheoTacGia(String tacgia) {
        if (this.baos.isEmpty()) {
            return null;
        } else {
            for (Bao baoCheck : this.baos) {
                if (baoCheck.tenTacGia == tacgia) {
                    return baoCheck;
                }
            }
        }
        return null;
    }
    public Bao timKiemBaoTheonhaXuatBan(String nhaXuatBan) {
        if (this.baos.isEmpty()) {
            return null;
        } else {
            for (Bao baoCheck : this.baos) {
                if (baoCheck.nhaXuatBan == nhaXuatBan) {
                    return baoCheck;
                }
            }
        }
        return null;
    }
    public TapChi timKiemTapChiTheoMa(Integer ma) {
        if (this.tapChis.isEmpty()) {
            return null;
        } else {
            for (TapChi tapChiCheck : this.tapChis) {
                if (tapChiCheck.ma == ma) {
                    return tapChiCheck;
                }
            }
        }
        return null;
    }
    public TapChi timKiemTapChiTheoTacGia(String tacgia) {
        if (this.tapChis.isEmpty()) {
            return null;
        } else {
            for (TapChi tapChiCheck : this.tapChis) {
                if (tapChiCheck.tenTacGia == tacgia) {
                    return tapChiCheck;
                }
            }
        }
        return null;
    }
    public TapChi timKiemTapChiTheonhaXuatBan(String nhaXuatBan) {
        if (this.tapChis.isEmpty()) {
            return null;
        } else {
            for (TapChi tapChiCheck : this.tapChis) {
                if (tapChiCheck.nhaXuatBan == nhaXuatBan) {
                    return tapChiCheck;
                }
            }
        }
        return null;
    }
    public TapChi timKiemTapChiTheoSoPhatHanh(Integer soPhatHanh) {
        if (this.tapChis.isEmpty()) {
            return null;
        } else {
            for (TapChi tapChiCheck : this.tapChis) {
                if (tapChiCheck.soPhatHanh == soPhatHanh) {
                    return tapChiCheck;
                }
            }
        }
        return null;
    }
    }


