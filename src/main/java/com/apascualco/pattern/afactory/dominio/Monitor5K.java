package com.apascualco.pattern.afactory.dominio;

public class Monitor5K extends Monitor {
    public Monitor5K(final String brand, final boolean curve, final Type screenType) {
        super(brand, curve, screenType, new Resolution(5120,2880));
    }
}
