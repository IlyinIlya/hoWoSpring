package com.SimpleShop.fun.controller;

import com.SimpleShop.fun.service.FunShopService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("order")
public class FunShopController {
    private final FunShopService funShopService;

    public FunShopController(FunShopService funShopService) {
        this.funShopService = funShopService;
    }


    @GetMapping("add")
    public List<Integer> add(@RequestParam List<Integer> products) {
        return funShopService.add(products);
    }

    @GetMapping("get")
    public List<Integer> get() {
        return funShopService.get();
    }
}
