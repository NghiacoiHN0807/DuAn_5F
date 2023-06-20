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
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
@Table(name = "chitietsanpham")
public class Chitietsanpham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idctsp;

    @NotBlank(message = "NotBlank")
    @Column(name = "MaCTSP")
    private String maCtsp;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDCL", referencedColumnName = "IDCL")
    private Chatlieu idcl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDMS", referencedColumnName = "IDMS")
    private Mausac idms;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDSize", referencedColumnName = "IDSize")
    private Size idSize;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDSP", referencedColumnName = "IDSP")
    private Sanpham idsp;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDLSP", referencedColumnName = "IDLSP")
    private Loaisp idlsp;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDXX", referencedColumnName = "IDXX")
    private Xuatxu idxx;
    @NotBlank(message = "NotBlank")
    @Column(name = "MoTa")
    private String moTa;
    @NotNull(message = "NotBlank")
    @Column(name = "SoLuongTon")
    private Integer soLuongTon;

    @NotNull(message = "NotBlank")
    @Column(name = "GiaNhap")
    private BigDecimal giaNhap;
    @NotNull(message = "NotBlank")
    @Column(name = "GiaBan")
    private BigDecimal giaBan;
    @NotNull(message = "NotBlank")
    @Column(name = "TrangThai")
    private Integer tinhTrang;

}
