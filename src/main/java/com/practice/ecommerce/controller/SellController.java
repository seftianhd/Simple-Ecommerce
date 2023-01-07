package com.practice.ecommerce.controller;

import com.practice.ecommerce.entity.Sell;
import com.practice.ecommerce.service.SellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/sell")
public class SellController {
    @Autowired
    private SellService sellService;

    @PostMapping
    public Sell save(@RequestBody Sell sell){
        return sellService.saveSell(sell);
    }

    @GetMapping
    public List<Sell> findAll(){
        return sellService.findAllSell();
    }
}
