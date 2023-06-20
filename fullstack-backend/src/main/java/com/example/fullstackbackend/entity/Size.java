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
@Table(name = "size")
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSize;
    @NotBlank(message = "NotBlank")
    @Column(name = "MaSize")
    private String maSize;
    @NotBlank(message = "NotBlank")
    @Column(name = "TenSize")
    private String tenSize;
    @NotNull(message = "NotBlank")
    @Column(name = "TinhTrang")
    private Integer tinhTrang;

}
