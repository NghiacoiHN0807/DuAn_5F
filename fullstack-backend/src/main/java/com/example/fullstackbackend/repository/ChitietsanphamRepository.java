package com.example.fullstackbackend.repository;

import com.example.fullstackbackend.entity.Chitietsanpham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface ChitietsanphamRepository extends JpaRepository<Chitietsanpham, Integer> {

}