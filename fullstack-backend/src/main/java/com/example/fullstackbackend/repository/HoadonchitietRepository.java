package com.example.fullstackbackend.repository;

import com.example.fullstackbackend.entity.Hoadonchitiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository

public interface HoadonchitietRepository extends JpaRepository<Hoadonchitiet, Integer> {

}