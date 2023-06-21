package com.example.fullstackbackend.entity;



@Entity
@Table(name = "giam_gia")
public class GiamGia {
    @Id
    @Column(name = "id_giam_gia")
    private Integer idGiamGia;

    @Column(name = "ma_giam_gia")
    private String maGiamGia;

    @Column(name = "ten_chuong_trinh")
    private String tenChuongTrinh;

    @Column(name = "ngay_bat_dau")
    private LocalDate ngayBatDau;

    @Column(name = "ngay_ket_thuc")
    private LocalDate ngayKetThuc;

    @Column(name = "muc_giam_phan_tram")
    private BigDecimal mucGiamPhanTram;

    @Column(name = "muc_giam_tien_mat")
    private BigDecimal mucGiamTienMat;

    @Column(name = "trang_thai")
    private Integer trangThai;

    public Integer getIdGiamGia() {
        return this.idGiamGia;
    }

    public void setIdGiamGia(Integer idGiamGia) {
        this.idGiamGia = idGiamGia;
    }

    public String getMaGiamGia() {
        return this.maGiamGia;
    }

    public void setMaGiamGia(String maGiamGia) {
        this.maGiamGia = maGiamGia;
    }

    public String getTenChuongTrinh() {
        return this.tenChuongTrinh;
    }

    public void setTenChuongTrinh(String tenChuongTrinh) {
        this.tenChuongTrinh = tenChuongTrinh;
    }

    public java.sql.Date getNgayBatDau() {
        return this.ngayBatDau;
    }

    public void setNgayBatDau(java.sql.Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public java.sql.Date getNgayKetThuc() {
        return this.ngayKetThuc;
    }

    public void setNgayKetThuc(java.sql.Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public BigDecimal getMucGiamPhanTram() {
        return this.mucGiamPhanTram;
    }

    public void setMucGiamPhanTram(BigDecimal mucGiamPhanTram) {
        this.mucGiamPhanTram = mucGiamPhanTram;
    }

    public BigDecimal getMucGiamTienMat() {
        return this.mucGiamTienMat;
    }

    public void setMucGiamTienMat(BigDecimal mucGiamTienMat) {
        this.mucGiamTienMat = mucGiamTienMat;
    }

    public Integer getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }
}
