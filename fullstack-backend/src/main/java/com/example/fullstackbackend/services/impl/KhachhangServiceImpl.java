package com.example.fullstackbackend.services.impl;

import com.example.fullstackbackend.repository.KhachhangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KhachhangServiceImpl {

    @Autowired
    private KhachhangRepository khachhangRepository;

}
