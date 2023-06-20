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
@Table(name = "xuatxu")
public class Xuatxu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idxx;

    @NotBlank(message = "NotBlank")
    @Column(name = "MaXX")
    private String maXx;
    @NotBlank(message = "NotBlank")
    @Column(name = "TenNuoc")
    private String tenNuoc;
    @NotNull(message = "NotBlank")
    @Column(name = "TinhTrang")
    private Integer tinhTrang;

}
