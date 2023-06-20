package com.example.fullstackbackend.repository;

import com.example.fullstackbackend.entity.Chatlieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ChatlieuRepository extends JpaRepository<Chatlieu, Integer> {

}