package nhanvien;

import qlcb.QLCB;

import java.util.ArrayList;
import java.util.List;

public class NhanVien extends QLCB {
    private String task;



    public void insertInfo(String name, Integer birth, String gender, String address, String task) {
        super.insertInfo(name, birth, gender, address);
        this.task = task;
    }

    @Override
    public String searchInfo(String name) {
        return super.searchInfo(name);
    }

    public String showListInfo() {
        List<NhanVien> models = new ArrayList<>();
        for(NhanVien model : models) {
            return "NhanVien{" +
                    "task='" + model.task + '\'' +
                    "name='" + model.name + '\'' +
                    ", birth='" + model.birth + '\'' +
                    ", gender='" + model.gender + '\'' +
                    ", address='" + model.address + '\'' +
                    '}';
        }
        return null;
    }

}
