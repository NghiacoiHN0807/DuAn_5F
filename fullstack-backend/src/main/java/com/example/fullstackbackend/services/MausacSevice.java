package com.example.fullstackbackend.services;

import com.example.fullstackbackend.entity.Mausac;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface MausacSevice {
    List<Mausac> getAll();

    Page<Mausac> chatlieuPage(Integer pageNo, Integer size);

    void add(Mausac add);

    void delete(Integer id);

    void update(Mausac update);

    Optional<Mausac> detail(Integer id);
}
