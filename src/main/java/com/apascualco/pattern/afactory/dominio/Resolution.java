package com.apascualco.pattern.afactory.dominio;

public class Resolution {

    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @SuppressWarnings("unused")
    private Resolution() { }

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

}
