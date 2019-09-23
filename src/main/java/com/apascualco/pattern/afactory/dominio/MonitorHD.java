package com.apascualco.pattern.afactory.dominio;

public class MonitorHD extends Monitor {
    public MonitorHD(final String brand, final boolean curve, final Type screenType) {
        super(brand, curve, screenType, new Resolution(1920,1080));
    }
}
