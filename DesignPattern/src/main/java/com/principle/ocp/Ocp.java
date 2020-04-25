package com.principle.ocp;

public class Ocp {
    public static void main(String[] args) {
        GrapeEditer grapeEditer = new GrapeEditer();
        grapeEditer.drawShape(new Circle());
        grapeEditer.drawShape(new Rectanglec());
    }
}
class GrapeEditer{
    public void drawShape(Shape s){
        s.draw();
    }
}

abstract class Shape{
    int m_type;
    public abstract void draw();
}

class Rectanglec extends Shape{
    public Rectanglec() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape{
    public Circle() {
        super.m_type = 2;
    }
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}