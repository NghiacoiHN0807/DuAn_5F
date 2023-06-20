package com.example.fullstackbackend.repository;

import com.example.fullstackbackend.entity.Sanpham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SanphamRepository extends JpaRepository<Sanpham, Integer> {

}