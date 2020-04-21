package com.principle.singleresponsiblity;

public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("小汽车");
    }

}

class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上跑");
    }
}
