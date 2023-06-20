package com.example.fullstackbackend.services.impl;

import com.example.fullstackbackend.entity.Chatlieu;
import com.example.fullstackbackend.repository.ChatlieuRepository;
import com.example.fullstackbackend.services.ChatlieuSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChatlieuServiceImpl implements ChatlieuSevice {

    @Autowired
    private ChatlieuRepository chatlieuRepository;

    @Override
    public List<Chatlieu> getAll() {
        return chatlieuRepository.findAll();
    }

    @Override
    public Page<Chatlieu> chatlieuPage(Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        return chatlieuRepository.findAll(pageable);
    }

    @Override
    public void add(Chatlieu chatlieu) {
        chatlieuRepository.save(chatlieu);
    }

    @Override
    public void delete(Integer id) {
        chatlieuRepository.deleteById(id);
    }

    @Override
    public void update(Chatlieu update) {
        chatlieuRepository.save(update);
    }

    @Override
    public Optional<Chatlieu> detail(Integer id) {
        Optional<Chatlieu> chatlieu = chatlieuRepository.findById(id);
        return chatlieu;
    }
}
