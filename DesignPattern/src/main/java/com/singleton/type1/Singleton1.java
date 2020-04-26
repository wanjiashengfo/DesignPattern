package com.singleton.type1;

public class Singleton1 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}

class Singleton{
    private Singleton(){

    }

    private final static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}
