package com.apascualco.pattern.afactory.dominio;

public class Monitor4K extends Monitor {
    public Monitor4K(final String brand, final boolean curve, final Type screenType) {
        super(brand, curve, screenType, new Resolution(3656,2664));
    }
}
