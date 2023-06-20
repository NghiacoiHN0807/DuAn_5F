package com.example.fullstackbackend.repository;

import com.example.fullstackbackend.entity.Giohang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository

public interface GiohangRepository extends JpaRepository<Giohang, Integer> {

}