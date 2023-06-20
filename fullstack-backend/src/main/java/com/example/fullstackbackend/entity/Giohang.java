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



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "giohang")
public class Giohang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idgh;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDKH", referencedColumnName = "IDKH")
    private Khachhang idkh;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDNV", referencedColumnName = "IDNV")
    private Nhanvien idnv;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "NgayTao")
    private java.sql.Date ngayTao;

    @Column(name = "NgayThanhToan")
    private java.sql.Date ngayThanhToan;

    @Column(name = "TenNguoiNhan")
    private String tenNguoiNhan;

    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "Sdt")
    private String sdt;

    @Column(name = "TinhTrang")
    private Integer tinhTrang;

}
