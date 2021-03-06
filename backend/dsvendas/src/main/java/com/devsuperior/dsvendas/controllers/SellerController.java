package com.devsuperior.dsvendas.controllers;

import com.devsuperior.dsvendas.dtos.SellerDTO;
import com.devsuperior.dsvendas.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sellers")
public class SellerController {

    private SellerService sellerService;

    @Autowired
    private SellerController(SellerService sellerService){
        this.sellerService = sellerService;
    }

    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll(){
        return ResponseEntity.ok(sellerService.findAll());
    }

}
