package com.singleton.type4;

public class Singleton4 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }

}

class Singleton{
    private static Singleton instance;

    private Singleton(){

    }

    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
