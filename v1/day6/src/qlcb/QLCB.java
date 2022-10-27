package qlcb;

import congnhan.CongNhan;
import kysu.KySu;
import nhanvien.NhanVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class QLCB {
    protected String id;
    protected String name;
    protected Integer birth;
    protected String gender;
    protected String address;
    protected static List<NhanVien> nhanViens;
    protected static List<KySu> kySus;
    protected static List<CongNhan> congNhans;

    public void setCongNhans(List<CongNhan> congNhans) {
        this.congNhans = congNhans;
    }

    @Override
    public String toString() {
        return "QLCB{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void insertInfo(String name, Integer birth, String gender, String address) {
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.address = address;
    }

    public String searchInfo(String name) {
        if (Objects.equals(name, this.name)){
            return this.toString();
        }
        return null;
    }
}
