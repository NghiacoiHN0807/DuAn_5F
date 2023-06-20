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
@Table(name = "giohangchitiet")
public class Giohangchitiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idghct;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDGH", referencedColumnName = "IDGH")
    private Giohang idgh;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDCTSP", referencedColumnName = "IDCTSP")
    private Chitietsanpham idctsp;

    @Column(name = "SoLuong")
    private Integer soLuong;

    @Column(name = "DonGia")
    private BigDecimal donGia;

    @Column(name = "DonGiaKhiGiam")
    private BigDecimal donGiaKhiGiam;

}
