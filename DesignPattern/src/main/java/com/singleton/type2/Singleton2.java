package com.singleton.type2;

public class Singleton2 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}

class Singleton{
    private Singleton(){

    }

    private  static Singleton instance ;

    static {
        instance = new Singleton();
    }
    public static Singleton getInstance(){
        return instance;
    }
}
