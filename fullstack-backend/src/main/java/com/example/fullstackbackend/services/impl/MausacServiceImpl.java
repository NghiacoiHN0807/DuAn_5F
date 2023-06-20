package com.example.fullstackbackend.services.impl;


import com.example.fullstackbackend.entity.Mausac;
import com.example.fullstackbackend.repository.MausacRepository;
import com.example.fullstackbackend.services.MausacSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MausacServiceImpl implements MausacSevice {

    @Autowired
    private MausacRepository mausacRepository;

    @Override
    public List<Mausac> getAll() {
        return mausacRepository.findAll();
    }

    @Override
    public Page<Mausac> chatlieuPage(Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        return mausacRepository.findAll(pageable);
    }

    @Override
    public void add(Mausac add) {
        mausacRepository.save(add);
    }

    @Override
    public void delete(Integer id) {
        mausacRepository.deleteById(id);
    }

    @Override
    public void update(Mausac update) {
        mausacRepository.save(update);
    }

    @Override
    public Optional<Mausac> detail(Integer id) {
        Optional<Mausac> mausac = mausacRepository.findById(id);
        return mausac;
    }


}
