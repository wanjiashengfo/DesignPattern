package com.factory.simplefactory.pizzastore.order;


import com.factory.simplefactory.pizzastore.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory){
        String orderType = "";
        this.simpleFactory = simpleFactory;
        do {
            orderType = getType();
             pizza = this.simpleFactory.createPizza(orderType);
             if(pizza != null){
                 pizza.prepare();
                 pizza.box();
                 pizza.cut();
                 pizza.box();
             }else {
                 System.out.println("无此披萨");
             }
        }while(true);
    }

    private String getType(){

        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = null;
            str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

    }
}
