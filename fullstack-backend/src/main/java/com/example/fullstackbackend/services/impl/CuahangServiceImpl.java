package com.example.fullstackbackend.services.impl;

import com.example.fullstackbackend.entity.Cuahang;
import com.example.fullstackbackend.repository.CuahangRepository;
import com.example.fullstackbackend.services.CuahangSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CuahangServiceImpl implements CuahangSevice {

    @Autowired
    private CuahangRepository cuahangRepository;


    @Override
    public List<Cuahang> getAll() {
        return cuahangRepository.findAll();
    }

    @Override
    public Page<Cuahang> chatlieuPage(Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        return cuahangRepository.findAll(pageable);
    }

    @Override
    public void add(Cuahang add) {
        cuahangRepository.save(add);
    }

    @Override
    public void delete(Integer id) {
        cuahangRepository.deleteById(id);
    }

    @Override
    public void update(Cuahang update) {
        cuahangRepository.save(update);
    }

    @Override
    public Optional<Cuahang> detail(Integer id) {
        Optional<Cuahang> Cuahang = cuahangRepository.findById(id);
        return Cuahang;
    }
}
