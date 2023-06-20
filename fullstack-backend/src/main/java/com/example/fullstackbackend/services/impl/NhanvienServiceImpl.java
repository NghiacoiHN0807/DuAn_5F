package com.example.fullstackbackend.services.impl;

import com.example.fullstackbackend.repository.NhanvienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NhanvienServiceImpl {

    @Autowired
    private NhanvienRepository nhanvienRepository;
}
