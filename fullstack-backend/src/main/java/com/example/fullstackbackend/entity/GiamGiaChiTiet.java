
import javax.persistence.*;

@Entity
@Table(name = "giam_gia_chi_tiet")
public class GiamGiaChiTiet {
    @Id
    @Column(name = "id_ggct")
    private Integer idGgct;

    @Column(name = "id_ctsp")
    private Integer idCtsp;

    @Column(name = "id_giam_gia")
    private Integer idGiamGia;

    @Column(name = "don_gia")
    private BigDecimal donGia;

    @Column(name = "so_tien_con_lai")
    private BigDecimal soTienConLai;

    @Column(name = "trang_thai")
    private Integer trangThai;

    public Integer getIdGgct() {
        return this.idGgct;
    }

    public void setIdGgct(Integer idGgct) {
        this.idGgct = idGgct;
    }

    public Integer getIdCtsp() {
        return this.idCtsp;
    }

    public void setIdCtsp(Integer idCtsp) {
        this.idCtsp = idCtsp;
    }

    public Integer getIdGiamGia() {
        return this.idGiamGia;
    }

    public void setIdGiamGia(Integer idGiamGia) {
        this.idGiamGia = idGiamGia;
    }

    public BigDecimal getDonGia() {
        return this.donGia;
    }

    public void setDonGia(BigDecimal donGia) {
        this.donGia = donGia;
    }

    public BigDecimal getSoTienConLai() {
        return this.soTienConLai;
    }

    public void setSoTienConLai(BigDecimal soTienConLai) {
        this.soTienConLai = soTienConLai;
    }

    public Integer getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }
}
