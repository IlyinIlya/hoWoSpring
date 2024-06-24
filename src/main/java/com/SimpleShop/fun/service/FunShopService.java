package com.SimpleShop.fun.service;

import com.SimpleShop.fun.components.ShoppingBasket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FunShopService {
    private final ShoppingBasket shoppingBasket;

    public FunShopService(ShoppingBasket shoppingBasket) {
        this.shoppingBasket = shoppingBasket;
    }

    public List<Integer> add(List<Integer> products) {
        return shoppingBasket.add(products);
    }

    public List<Integer> get() {
        return shoppingBasket.get();
    }

}
