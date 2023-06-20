package com.example.fullstackbackend.services;

import com.example.fullstackbackend.entity.Chitietsanpham;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface ChitietsanphamSevice {
    Page<Chitietsanpham> chatlieuPage(Integer pageNo, Integer size);

    void add(Chitietsanpham add);

    void delete(Integer id);

    void update(Chitietsanpham update);

    Optional<Chitietsanpham> detail(Integer id);
}
