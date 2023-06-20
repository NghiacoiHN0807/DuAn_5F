package com.example.fullstackbackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "khachhang")
public class Khachhang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idkh;

    @Column(name = "MaKH")
    private String maKh;

    @Column(name = "HoKH")
    private String hoKh;

    @Column(name = "TenKH")
    private String tenKh;

    @Column(name = "SDT")
    private String sdt;

    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "TrangThai")
    private Integer trangThai;

}
