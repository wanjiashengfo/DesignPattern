package com.singleton.type7;

public class Singleton7 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance == instance1);
    }
}
enum Singleton {
    INSTANCE;
    public void sayOK(){
        System.out.println("ok");
    }
}