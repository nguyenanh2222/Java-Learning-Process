import java.time.Month;
import java.util.Date;
import java.util.Random;

public class TapChi extends Bao{
    public TapChi(Integer ma, String nhaXuatBan, String tenTacGia, Integer soTrang, Date launch_day, Integer soPhatHanh) {
        super(ma, nhaXuatBan, tenTacGia, soTrang, launch_day);
        this.soPhatHanh = soPhatHanh;
        this.type = Type.TAPCHI;
        Random ran = new Random();
        this.salt = ran.nextInt();;
    }

    protected Integer soPhatHanh;

    @Override
    public String toString() {
        return "TapChi{" +
                "launch_day=" + launch_day + '\'' +
                ", tenTacGia='" + tenTacGia + '\'' +
                ", ma='" + ma + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", soTrang=" + soTrang + '\'' +
                ", soPhatHanh=" + soPhatHanh +
                '}';
    }

    public boolean suaTapChi(String nhaXuatBan, Integer soPhatHanh, String tenTacGia, Integer soTrang, Date launch_day) {
        if (nhaXuatBan != "" ){
            this.nhaXuatBan = nhaXuatBan;
        }
        if (soPhatHanh != this.soPhatHanh){
            this.soPhatHanh = soPhatHanh;
        }

        if (tenTacGia != ""){
            this.tenTacGia = tenTacGia;
        }
        if (soTrang != this.soTrang){
            this.soTrang = soTrang;
        }
        if(this.launch_day != launch_day){
            this.launch_day = launch_day;
        }
        if (nhaXuatBan == "" && soPhatHanh == this.soPhatHanh && tenTacGia != "" && soTrang != this.soTrang){
            return Boolean.FALSE;
        }
        return Boolean.TRUE;

    }
}
