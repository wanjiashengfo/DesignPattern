package com.principle.inversion;

public class Depand02 {
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        OpenAndClose02 openAndClose02 = new OpenAndClose02(changHong);
        openAndClose02.open();
    }
}

interface IOpenAndClose02 {//通过构造方法依赖传递
    public  void open();
}


class OpenAndClose02 implements  IOpenAndClose02{
    public ITV tv;

    public OpenAndClose02(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}
