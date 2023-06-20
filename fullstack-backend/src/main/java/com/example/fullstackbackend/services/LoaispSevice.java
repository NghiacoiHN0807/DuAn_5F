package com.example.fullstackbackend.services;

import com.example.fullstackbackend.entity.Loaisp;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface LoaispSevice {

    List<Loaisp> getAll();
    Page<Loaisp> chatlieuPage(Integer pageNo, Integer size);

    void add(Loaisp add);

    void delete(Integer id);

    void update(Loaisp update);

    Optional<Loaisp> detail(Integer id);
}
