
import javax.persistence.*;

@Entity
@Table(name = "hinh_thuc_thanh_toan")
public class HinhThucThanhToan {
    @Id
    @Column(name = "id_httt")
    private Integer idHttt;

    @Column(name = "hinh_thuc")
    private String hinhThuc;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "trang_thai")
    private Integer trangThai;

    public Integer getIdHttt() {
        return this.idHttt;
    }

    public void setIdHttt(Integer idHttt) {
        this.idHttt = idHttt;
    }

    public String getHinhThuc() {
        return this.hinhThuc;
    }

    public void setHinhThuc(String hinhThuc) {
        this.hinhThuc = hinhThuc;
    }

    public String getMoTa() {
        return this.moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Integer getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }
}
