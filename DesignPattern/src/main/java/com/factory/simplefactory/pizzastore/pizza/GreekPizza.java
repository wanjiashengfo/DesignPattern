package com.factory.simplefactory.pizzastore.pizza;


import com.factory.simplefactory.pizzastore.Pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备希腊披萨");
    }
}
