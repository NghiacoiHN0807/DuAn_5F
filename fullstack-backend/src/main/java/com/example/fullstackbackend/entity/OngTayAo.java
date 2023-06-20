
import javax.persistence.*;

@Entity
@Table(name = "ong_tay_ao")
public class OngTayAo {
    @Id
    @Column(name = "id_ong_tay")
    private Integer idOngTay;

    @Column(name = "ma_ong_tay")
    private String maOngTay;

    @Column(name = "loai_ong_tay")
    private String loaiOngTay;

    @Column(name = "trang_thai")
    private Integer trangThai;

    public Integer getIdOngTay() {
        return this.idOngTay;
    }

    public void setIdOngTay(Integer idOngTay) {
        this.idOngTay = idOngTay;
    }

    public String getMaOngTay() {
        return this.maOngTay;
    }

    public void setMaOngTay(String maOngTay) {
        this.maOngTay = maOngTay;
    }

    public String getLoaiOngTay() {
        return this.loaiOngTay;
    }

    public void setLoaiOngTay(String loaiOngTay) {
        this.loaiOngTay = loaiOngTay;
    }

    public Integer getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }
}
