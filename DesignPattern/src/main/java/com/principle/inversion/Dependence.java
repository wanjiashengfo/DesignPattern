package com.principle.inversion;

public class Dependence {//依赖倒转原则
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new WeChat());
    }
}
interface IReceiver{
    public String getInfo();
}

class Email implements IReceiver{

    public String getInfo() {
        return "邮件：hell world";
    }
}
class WeChat implements IReceiver{

    public String getInfo() {
        return "微信：hell world";
    }
}

class Person{
    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}
