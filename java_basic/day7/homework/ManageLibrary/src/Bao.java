import java.util.Date;
import java.util.Random;

public class Bao extends Sach{
    Type type;

    public Bao(Integer ma, String nhaXuatBan, String tenTacGia, Integer soTrang, Date launch_day) {
        super(ma, nhaXuatBan, tenTacGia, soTrang);
        this.launch_day = launch_day;
        this.type = Type.BAO;
        Random ran = new Random();
        this.salt = ran.nextInt();;
    }

    protected Date launch_day;

    @Override
    public String toString() {
        return "Bao{" +
                "launch_day=" + launch_day +
                ", tenTacGia='" + tenTacGia + '\'' +
                ", ma='" + ma + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", soTrang=" + soTrang +
                '}';
    }

    public boolean suaBao(String nhaXuatBan, String tenTacGia, Integer soTrang, Date launch_day) {
        if (nhaXuatBan != "" ){
            this.nhaXuatBan = nhaXuatBan;
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
        if (nhaXuatBan == "" && tenTacGia != "" && soTrang != this.soTrang && this.launch_day == launch_day){
            return Boolean.FALSE;
        }
        return Boolean.TRUE;

    }
    }


