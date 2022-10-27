package congnhan;
import qlcb.QLCB;
import java.util.ArrayList;
import java.util.List;

public class CongNhan extends QLCB{
        private String level;

        public void insertInfo(String name, Integer birth, String gender, String address, String level) {
            super.insertInfo(name, birth, gender, address);
            this.level = level;
        }

        @Override
        public String searchInfo(String name) {
            return super.searchInfo(name);
        }

        public String showListInfo() {
            List<CongNhan> models = new ArrayList<>();
            for(CongNhan model : models) {
                return "NhanVien{" +
                        "task='" + model.level + '\'' +
                        "name='" + model.name + '\'' +
                        ", birth='" + model.birth + '\'' +
                        ", gender='" + model.gender + '\'' +
                        ", address='" + model.address + '\'' +
                        '}';
            }
            return null;
        }

    }



