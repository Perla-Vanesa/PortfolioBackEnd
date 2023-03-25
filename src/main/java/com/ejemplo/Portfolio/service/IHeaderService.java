package com.ejemplo.Portfolio.service;

import com.ejemplo.Portfolio.model.Header;
import java.util.List;

public interface IHeaderService {
    
    public List<Header> verHeader();
    
    public void crearHeader (Header head);
    
    public Header encontrarHeader(Long id);
    
}
