import java.io.Serial;
import java.io.Serializable;
import java.util.Random;

public class Sach implements Serializable {     // Serializable dung de ghi va doc theo Object
    @Serial
    private static final long serialVersionUID = 1L;
    final Type type;
    String tenTacGia;
    Integer ma;
    String nhaXuatBan;
    Integer soTrang;


    Integer salt;

    @Override
    public String toString() {
        return "Sach{" +
                "tenTacGia='" + tenTacGia + '\'' +
                ", ma='" + ma + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", soTrang=" + soTrang +
                '}';
    }

    public Sach(Integer ma, String nhaXuatBan, String tenTacGia, Integer soTrang)
    {
        this.type = Type.SACH;
        this.ma=ma;
        this.nhaXuatBan=nhaXuatBan;
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
        Random ran = new Random();
        this.salt = ran.nextInt();;

    }
    public boolean suaSach(String nhaXuatBan, String tenTacGia, Integer soTrang) {
        if (nhaXuatBan != "" ) {
            this.nhaXuatBan = nhaXuatBan;
            if (tenTacGia != "") {
                this.tenTacGia = tenTacGia;
            }
            if (soTrang != this.soTrang) {
                this.soTrang = soTrang;
            }
            if (nhaXuatBan == "" && tenTacGia != "" && soTrang != this.soTrang) {
                return Boolean.FALSE;
            }
            return Boolean.TRUE;
        }
        return false;
    }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                System.out.println("lỗi object null");
                return false;
            }

            if (obj.getClass() != this.getClass()) {
                System.out.println("lỗi object khác class");
                return false;
            }
            final Sach other = (Sach) obj;
            if (!this.ma.equals(other.ma)) {
                System.out.println(this.ma);
                System.out.println(other.ma);
                System.out.println("lỗi object khác mã");
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            Integer hash = 3;
            hash = 53 * hash + (this.ma != null ? this.ma.hashCode() : 0);
            hash = 53 * hash + this.ma;
            return hash;
        }
}
