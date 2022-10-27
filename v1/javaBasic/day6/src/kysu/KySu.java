package kysu;

import qlcb.QLCB;

import java.util.ArrayList;
import java.util.List;

public class KySu extends QLCB {
    private String major;
    private String certificate;

        public void insertInfo(String name, Integer birth, String gender, String address, String major, String certificate) {
            super.insertInfo(name, birth, gender, address);
            this.major = major;
            this.certificate = certificate;
        }

        @Override
        public String searchInfo(String name) {
            return super.searchInfo(name);
        }

        public String showListInfo() {
            List<KySu> models = new ArrayList<>();
            for(KySu model : models) {
                return "Kỹ Sư{" +
                        "major=" + model.major + '\'' +
                        "certificate=" + model.certificate + '\'' +
                        "name='" + model.name + '\'' +
                        ", birth='" + model.birth + '\'' +
                        ", gender='" + model.gender + '\'' +
                        ", address='" + model.address + '\'' +
                        '}';
            }
            return null;
        }

    }
