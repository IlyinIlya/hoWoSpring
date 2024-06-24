package com.SimpleShop.fun.components;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Component
@SessionScope
public class ShoppingBasket {
    private final Set<Integer> products = new HashSet<>();

    public List<Integer> add(List<Integer> products) {
        this.products.addAll(products);
        return new ArrayList<>(this.products);
    }

    public List<Integer> get() {
        return new ArrayList<>(this.products);
    }
}
