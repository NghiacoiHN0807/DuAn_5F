package com.example.fullstackbackend.repository;

import com.example.fullstackbackend.entity.Giohangchitiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface GiohangchitietRepository extends JpaRepository<Giohangchitiet, Integer> {

}