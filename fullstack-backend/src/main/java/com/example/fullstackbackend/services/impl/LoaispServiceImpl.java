package com.example.fullstackbackend.services.impl;

import com.example.fullstackbackend.entity.Loaisp;
import com.example.fullstackbackend.repository.LoaispRepository;
import com.example.fullstackbackend.services.LoaispSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoaispServiceImpl implements LoaispSevice {

    @Autowired
    private LoaispRepository loaispRepository;

    @Override
    public List<Loaisp> getAll() {
        return loaispRepository.findAll();
    }

    @Override
    public Page<Loaisp> chatlieuPage(Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        return loaispRepository.findAll(pageable);
    }

    @Override
    public void add(Loaisp add) {
        loaispRepository.save(add);
    }

    @Override
    public void delete(Integer id) {
        loaispRepository.deleteById(id);
    }

    @Override
    public void update(Loaisp update) {
        loaispRepository.save(update);
    }

    @Override
    public Optional<Loaisp> detail(Integer id) {
        Optional<Loaisp> Loaisp = loaispRepository.findById(id);
        return Loaisp;
    }
}
