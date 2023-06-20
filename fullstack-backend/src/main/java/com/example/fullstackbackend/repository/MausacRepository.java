package com.example.fullstackbackend.repository;

import com.example.fullstackbackend.entity.Mausac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface MausacRepository extends JpaRepository<Mausac, Integer> {

}