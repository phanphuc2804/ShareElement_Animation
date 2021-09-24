package com.example.flowershop;

public class Flowers {
    int imgFlower;
    String textName;
    String textPrice;

    public Flowers(int imgFlower, String textName, String textPrice) {
        this.imgFlower = imgFlower;
        this.textName = textName;
        this.textPrice = textPrice;
    }

    public Flowers() {
    }

    public int getImgFlower() {
        return imgFlower;
    }

    public void setImgFlower(int imgFlower) {
        this.imgFlower = imgFlower;
    }

    public String getTextName() {
        return textName;
    }

    public void setTextName(String textName) {
        this.textName = textName;
    }

    public String getTextPrice() {
        return textPrice;
    }

    public void setTextPrice(String textPrice) {
        this.textPrice = textPrice;
    }
}
