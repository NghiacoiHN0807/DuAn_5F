package com.example.fullstackbackend.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "sanpham")
public class Sanpham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idsp;
    @NotBlank(message = "NotBlank")
    @Column(name = "MaSP")
    private String maSp;
    @NotBlank(message = "NotBlank")
    @Column(name = "TenSp")
    private String tenSp;
    @NotNull(message = "NotBlank")
    @Column(name = "TinhTrang")
    private Integer tinhTrang;

}
