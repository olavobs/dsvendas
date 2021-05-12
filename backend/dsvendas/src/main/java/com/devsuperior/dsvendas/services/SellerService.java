package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dtos.SellerDTO;
import com.devsuperior.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    private SellerRepository sellerRepository;

    @Autowired
    private SellerService(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

    public List<SellerDTO> findAll() {
        return sellerRepository.findAll()
                .stream()
                .map(SellerDTO::new)
                .collect(Collectors.toList());
    }
}
