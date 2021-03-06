package com.factory.simplefactory.pizzastore.order;


import com.factory.simplefactory.pizzastore.Pizza;
import com.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.factory.simplefactory.pizzastore.pizza.GreekPizza;

public class SimpleFactory {
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");

        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName(orderType);
        }else if(orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName(orderType);
        }
        return pizza;
    }
}
