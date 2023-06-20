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



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "loaisp")
public class Loaisp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idlsp;

    @Column(name = "MaLSP")
    private String maLsp;

    @Column(name = "TenLSP")
    private String tenLsp;

    @Column(name = "TinhTrang")
    private Integer tinhTrang;

}
