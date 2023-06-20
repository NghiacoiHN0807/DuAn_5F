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
@Table(name = "cuahang")
public class Cuahang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idch;

    @NotBlank(message = "Not Blank")
    @Column(name = "MaCH")
    private String maCh;

    @NotBlank(message = "Not Blank")
    @Column(name = "TenCH")
    private String tenCh;

    @NotBlank(message = "Not Blank")
    @Column(name = "DiaChi")
    private String diaChi;

    @NotNull(message = "Not Blank")
    @Column(name = "TrangThai")
    private Integer trangThai;

}
