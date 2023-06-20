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
@Table(name = "mausac")
public class Mausac {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idms;

    @Column(name = "MaMS")
    private String maMs;

    @Column(name = "TenMS")
    private String tenMs;

    @Column(name = "TinhTrang")
    private Integer tinhTrang;

}
