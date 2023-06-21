package com.example.fullstackbackend.entity;



@Entity
@Table(name = "lich_su_giam_gia")
public class LichSuGiamGia {
    @Id
    @Column(name = "id_lsgg")
    private Integer idLsgg;

    @Column(name = "id_hd")
    private Integer idHd;

    @Column(name = "id_ggct")
    private Integer idGgct;

    @Column(name = "gia_ban_dau")
    private String giaBanDau;

    @Column(name = "gia_da_giam")
    private String giaDaGiam;

    @Column(name = "ngay_mua")
    private String ngayMua;

    public Integer getIdLsgg() {
        return this.idLsgg;
    }

    public void setIdLsgg(Integer idLsgg) {
        this.idLsgg = idLsgg;
    }

    public Integer getIdHd() {
        return this.idHd;
    }

    public void setIdHd(Integer idHd) {
        this.idHd = idHd;
    }

    public Integer getIdGgct() {
        return this.idGgct;
    }

    public void setIdGgct(Integer idGgct) {
        this.idGgct = idGgct;
    }

    public String getGiaBanDau() {
        return this.giaBanDau;
    }

    public void setGiaBanDau(String giaBanDau) {
        this.giaBanDau = giaBanDau;
    }

    public String getGiaDaGiam() {
        return this.giaDaGiam;
    }

    public void setGiaDaGiam(String giaDaGiam) {
        this.giaDaGiam = giaDaGiam;
    }

    public String getNgayMua() {
        return this.ngayMua;
    }

    public void setNgayMua(String ngayMua) {
        this.ngayMua = ngayMua;
    }
}
