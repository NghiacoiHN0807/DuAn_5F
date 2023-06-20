package com.example.fullstackbackend.services;

import com.example.fullstackbackend.entity.Xuatxu;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface XuatxuSevice {

    List<Xuatxu> getAll();

    Page<Xuatxu> chatlieuPage(Integer pageNo, Integer size);

    Xuatxu add(Xuatxu add);

    void delete(Integer id);

    Boolean checkExists(Integer id);

    Xuatxu update(Xuatxu update);

    Optional<Xuatxu> detail(Integer id);
}
