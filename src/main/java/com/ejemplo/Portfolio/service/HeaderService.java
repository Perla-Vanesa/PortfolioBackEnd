package com.ejemplo.Portfolio.service;

import com.ejemplo.Portfolio.model.Header;
import com.ejemplo.Portfolio.repository.HeaderRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeaderService implements IHeaderService{
    
    @Autowired
    public HeaderRepository headRepo;

    @Override
    public List<Header> verHeader() {
        return headRepo.findAll();
    }

    @Override
    public void crearHeader(Header head) {
        headRepo.save(head);
    }

    @Override
    public Header encontrarHeader(Long id) {
        Header head = headRepo.findById(id).orElse(null);
        return head;
    }
    
}
