package com.alexjoiner.memorialspringapp.service;

import com.alexjoiner.memorialspringapp.domain.MemorialMessage;
import com.alexjoiner.memorialspringapp.repository.MemorialMessageRepo;
import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemorialMessageService {

    @Autowired
    private MemorialMessageRepo memorialMessageRepo;

    public List<MemorialMessage> findAll() {
        return memorialMessageRepo.findAll();
    }

    public MemorialMessage save(MemorialMessage message) {

        return memorialMessageRepo.save(message);
    }
}
