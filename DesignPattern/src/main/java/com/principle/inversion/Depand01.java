package com.principle.inversion;

public class Depand01 {//通过接口传递实现依赖

    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(changHong);
    }
}

interface IOpenAndClose{
    public void open(ITV tv);
}

interface ITV{
    public void play();
}

class ChangHong implements ITV{

    @Override
    public void play() {
        System.out.println("长虹电视机");
    }
}

class OpenAndClose implements IOpenAndClose{

    @Override
    public void open(ITV tv) {
        tv.play();
    }
}