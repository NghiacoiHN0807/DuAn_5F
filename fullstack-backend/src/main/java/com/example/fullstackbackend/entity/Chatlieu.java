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
@Table(name = "chatlieu")
public class Chatlieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCL")
    private Integer idcl;

    @NotBlank(message = "Not Blank")
    @Column(name = "MaCL")
    private String maCl;
    @NotBlank(message = "Not Blank")
    @Column(name = "TenCL")
    private String tenCl;
    @NotNull(message = "Not Blank")
    @Column(name = "TinhTrang")
    private Integer tinhTrang;

}
