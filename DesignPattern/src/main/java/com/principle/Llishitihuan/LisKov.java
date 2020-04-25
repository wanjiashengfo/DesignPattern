package com.principle.Llishitihuan;

public class LisKov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 - 3 =" + a.func1(11, 3));
        System.out.println("1 - 8 =" + a.func1(1, 8));
        B b = new B();
        System.out.println("11 - 3 =" +  b.func3(11, 3));
        System.out.println("1 - 8 =" + b.func3(1, 8));
    }
}
class Base{

 }


class A extends Base{
    public int func1(int a , int b){
        return  a -b;
    }
}

class B extends Base{
    private A a = new A();

    public int func3(int a,int b){
        return this.a.func1(a,b);
    }
}