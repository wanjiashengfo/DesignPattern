package com.prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        do {
            Sheep sheep = new Sheep("xufan",1,"blue");
            System.out.println(sheep.clone());
        }while (true);
    }
}

