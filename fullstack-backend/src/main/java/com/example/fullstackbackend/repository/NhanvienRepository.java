package com.example.fullstackbackend.repository;

import com.example.fullstackbackend.entity.Nhanvien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository

public interface NhanvienRepository extends JpaRepository<Nhanvien, Integer> {

}