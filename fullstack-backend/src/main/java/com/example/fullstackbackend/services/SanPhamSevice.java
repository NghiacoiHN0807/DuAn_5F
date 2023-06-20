package com.example.fullstackbackend.services;

import com.example.fullstackbackend.entity.Sanpham;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface SanPhamSevice {

    List<Sanpham> getAll();
    Page<Sanpham> chatlieuPage(Integer pageNo, Integer size);

    void add(Sanpham add);

    void delete(Integer id);

    void update(Sanpham update);

    Optional<Sanpham> detail(Integer id);
}
