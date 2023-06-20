package com.example.fullstackbackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Date;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "hoadon")
public class Hoadon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idhd;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDKH", referencedColumnName = "IDKH")
    private Khachhang idkh;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDNV", referencedColumnName = "IDNV")
    private Nhanvien idnv;

    @Column(name = "MaHD")
    private String maHd;

    @Column(name = "NgayTao")
    private Date ngayTao;

    @Column(name = "NgayThanhToan")
    private Date ngayThanhToan;

    @Column(name = "TongTien")
    private BigDecimal tongTien;

    @Column(name = "SoTienGiamGia")
    private BigDecimal soTienGiamGia;

    @Column(name = "ThanhTien")
    private BigDecimal thanhTien;

    @Column(name = "TienDua")
    private BigDecimal tienDua;

    @Column(name = "TienThua")
    private BigDecimal tienThua;

    @Column(name = "TienShip")
    private BigDecimal tienShip;

    @Column(name = "HinhThucThanhToan")
    private String hinhThucThanhToan;

    @Column(name = "TenKH")
    private String tenKh;

    @Column(name = "SDTKH")
    private String sdtkh;

    @Column(name = "TenShip")
    private String tenShip;

    @Column(name = "SDTShip")
    private String sdtShip;

    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "NgayMuonNhan")
    private Date ngayMuonNhan;

    @Column(name = "NgayGiao")
    private Date ngayGiao;

    @Column(name = "NgayGiaoThanhCong")
    private Date ngayGiaoThanhCong;

    @Column(name = "TrangThai")
    private Integer trangThai;
}
