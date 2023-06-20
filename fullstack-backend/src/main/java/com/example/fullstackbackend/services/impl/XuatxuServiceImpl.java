package com.example.fullstackbackend.services.impl;

import com.example.fullstackbackend.entity.Xuatxu;
import com.example.fullstackbackend.repository.XuatxuRepository;
import com.example.fullstackbackend.services.XuatxuSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class XuatxuServiceImpl implements XuatxuSevice {

    @Autowired
    private XuatxuRepository xuatxuRepository;


    @Override
    public List<Xuatxu> getAll() {
        return xuatxuRepository.findAll();
    }

    @Override
    public Page<Xuatxu> chatlieuPage(Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        return xuatxuRepository.findAll(pageable);
    }

    @Override
    public Xuatxu add(Xuatxu add) {
        return xuatxuRepository.save(add);
    }

    @Override
    public void delete(Integer id) {
        xuatxuRepository.deleteById(id);
    }

    @Override
    public Boolean checkExists(Integer id) {
        return xuatxuRepository.existsById(id);
    }

    @Override
    public Xuatxu update(Xuatxu update) {
       return xuatxuRepository.save(update);
    }

    @Override
    public Optional<Xuatxu> detail(Integer id) {
        Optional<Xuatxu> xuatxu = xuatxuRepository.findById(id);
        return xuatxu;
    }
}
