package com.example.fullstackbackend.entity;



@Entity
@Table(name = "dia_chi")
public class DiaChi {
    @Id
    @Column(name = "id_dia_chi")
    private Integer idDiaChi;

    @Column(name = "dia_chi_cu_the")
    private String diaChiCuThe;

    @Column(name = "phuong_xa")
    private String phuongXa;

    @Column(name = "quan_huyen")
    private String quanHuyen;

    @Column(name = "tinh_thanh")
    private String tinhThanh;

    @Column(name = "loai_dia_chi")
    private Integer loaiDiaChi;

    @Column(name = "sdt")
    private String sdt;

    @Column(name = "ten_nguoi_nhan")
    private String tenNguoiNhan;

    @Column(name = "trang_thai")
    private Integer trangThai;

    public Integer getIdDiaChi() {
        return this.idDiaChi;
    }

    public void setIdDiaChi(Integer idDiaChi) {
        this.idDiaChi = idDiaChi;
    }

    public String getDiaChiCuThe() {
        return this.diaChiCuThe;
    }

    public void setDiaChiCuThe(String diaChiCuThe) {
        this.diaChiCuThe = diaChiCuThe;
    }

    public String getPhuongXa() {
        return this.phuongXa;
    }

    public void setPhuongXa(String phuongXa) {
        this.phuongXa = phuongXa;
    }

    public String getQuanHuyen() {
        return this.quanHuyen;
    }

    public void setQuanHuyen(String quanHuyen) {
        this.quanHuyen = quanHuyen;
    }

    public String getTinhThanh() {
        return this.tinhThanh;
    }

    public void setTinhThanh(String tinhThanh) {
        this.tinhThanh = tinhThanh;
    }

    public Integer getLoaiDiaChi() {
        return this.loaiDiaChi;
    }

    public void setLoaiDiaChi(Integer loaiDiaChi) {
        this.loaiDiaChi = loaiDiaChi;
    }

    public String getSdt() {
        return this.sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTenNguoiNhan() {
        return this.tenNguoiNhan;
    }

    public void setTenNguoiNhan(String tenNguoiNhan) {
        this.tenNguoiNhan = tenNguoiNhan;
    }

    public Integer getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }
}
