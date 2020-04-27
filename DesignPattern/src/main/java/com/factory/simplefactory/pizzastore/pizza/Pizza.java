package com.factory.simplefactory.pizzastore;

import lombok.Data;

@Data
public abstract class Pizza {
    private String name;

    public abstract void prepare();

    public void bake(){
        System.out.println(name + "baking");
    }
    public void cut(){
        System.out.println(name + "cut");
    }
    public void box(){
        System.out.println(name + "box");
    }
}
