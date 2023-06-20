package com.example.fullstackbackend.services;

import com.example.fullstackbackend.entity.Cuahang;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface CuahangSevice {
    List<Cuahang> getAll();

    Page<Cuahang> chatlieuPage(Integer pageNo, Integer size);

    void add(Cuahang add);

    void delete(Integer id);

    void update(Cuahang update);

    Optional<Cuahang> detail(Integer id);

}
