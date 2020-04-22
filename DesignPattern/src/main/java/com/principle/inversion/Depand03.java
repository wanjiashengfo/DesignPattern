package com.principle.inversion;

public class Depand03 {
    public static void main(String[] args) {
        OpenAndClose03 openAndClose03 = new OpenAndClose03();
        openAndClose03.setTv(new ChangHong());
        openAndClose03.open();;
    }
}

interface IOpenAndClose03 {
    public void open();
    public void setTv(ITV tv);
}

class OpenAndClose03 implements IOpenAndClose03{
    private ITV tv;
    @Override
    public void open() {
        this.tv.play();
    }

    @Override
    public void setTv(ITV tv) {
        this.tv = tv;
    }
}
