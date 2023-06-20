package com.example.fullstackbackend.repository;

import com.example.fullstackbackend.entity.Xuatxu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface XuatxuRepository extends JpaRepository<Xuatxu, Integer> {

}