package com.example.fullstackbackend.entity;



@Entity
@Table(name = "hoa_don_chi_tiet")
public class HoaDonChiTiet {
    @Id
    @Column(name = "id_hdct")
    private Integer idHdct;

    @Column(name = "id_hd")
    private Integer idHd;

    @Column(name = "id_ctsp")
    private Integer idCtsp;

    @Column(name = "so_luong")
    private Integer soLuong;

    @Column(name = "don_gia")
    private BigDecimal donGia;

    @Column(name = "ly_do_huy")
    private String lyDoHuy;

    @Column(name = "trang_thai")
    private Integer trangThai;

    public Integer getIdHdct() {
        return this.idHdct;
    }

    public void setIdHdct(Integer idHdct) {
        this.idHdct = idHdct;
    }

    public Integer getIdHd() {
        return this.idHd;
    }

    public void setIdHd(Integer idHd) {
        this.idHd = idHd;
    }

    public Integer getIdCtsp() {
        return this.idCtsp;
    }

    public void setIdCtsp(Integer idCtsp) {
        this.idCtsp = idCtsp;
    }

    public Integer getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getDonGia() {
        return this.donGia;
    }

    public void setDonGia(BigDecimal donGia) {
        this.donGia = donGia;
    }

    public String getLyDoHuy() {
        return this.lyDoHuy;
    }

    public void setLyDoHuy(String lyDoHuy) {
        this.lyDoHuy = lyDoHuy;
    }

    public Integer getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }
}
