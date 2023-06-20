package com.example.fullstackbackend.services;

import com.example.fullstackbackend.entity.Chatlieu;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface ChatlieuSevice {

    List<Chatlieu> getAll();

    Page<Chatlieu> chatlieuPage(Integer pageNo, Integer size);

    void add(Chatlieu add);

    void delete(Integer id);

    void update(Chatlieu update);

    Optional<Chatlieu> detail(Integer id);


}
