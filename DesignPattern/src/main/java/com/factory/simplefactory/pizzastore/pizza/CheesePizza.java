package com.factory.simplefactory.pizzastore.pizza;

import com.factory.simplefactory.pizzastore.Pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备奶酪披萨");
    }
}
