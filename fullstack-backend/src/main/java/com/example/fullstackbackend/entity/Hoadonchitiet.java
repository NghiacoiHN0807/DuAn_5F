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



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "hoadonchitiet")
public class Hoadonchitiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idhdct;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDHD", referencedColumnName = "IDHD")
    private Hoadon idhd;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDCTSP", referencedColumnName = "IDCTSP")
    private Chitietsanpham idctsp;

    @Column(name = "SoLuong")
    private Integer soLuong;

    @Column(name = "DonGia")
    private BigDecimal donGia;

    @Column(name = "LyDoHuy")
    private String lyDoHuy;

    @Column(name = "TrangThai")
    private Integer trangThai;

}
