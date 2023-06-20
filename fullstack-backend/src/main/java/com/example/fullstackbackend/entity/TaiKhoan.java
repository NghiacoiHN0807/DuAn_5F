
import javax.persistence.*;

@Entity
@Table(name = "tai_khoan")
public class TaiKhoan {
    @Id
    @Column(name = "id_tai_khoan")
    private Integer idTaiKhoan;

    @Column(name = "id_dia_chi")
    private Integer idDiaChi;

    @Column(name = "ma_tai_khoan")
    private String maTaiKhoan;

    @Column(name = "ho")
    private String ho;

    @Column(name = "ten")
    private String ten;

    @Column(name = "sdt")
    private String sdt;

    @Column(name = "email")
    private String email;

    @Column(name = "mat_khau")
    private String matKhau;

    @Column(name = "chuc_vu")
    private Integer chucVu;

    @Column(name = "quyen_vu")
    private Integer quyenVu;

    @Column(name = "trang_thai")
    private Integer trangThai;

    public Integer getIdTaiKhoan() {
        return this.idTaiKhoan;
    }

    public void setIdTaiKhoan(Integer idTaiKhoan) {
        this.idTaiKhoan = idTaiKhoan;
    }

    public Integer getIdDiaChi() {
        return this.idDiaChi;
    }

    public void setIdDiaChi(Integer idDiaChi) {
        this.idDiaChi = idDiaChi;
    }

    public String getMaTaiKhoan() {
        return this.maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getHo() {
        return this.ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return this.ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return this.sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatKhau() {
        return this.matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public Integer getChucVu() {
        return this.chucVu;
    }

    public void setChucVu(Integer chucVu) {
        this.chucVu = chucVu;
    }

    public Integer getQuyenVu() {
        return this.quyenVu;
    }

    public void setQuyenVu(Integer quyenVu) {
        this.quyenVu = quyenVu;
    }

    public Integer getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }
}
