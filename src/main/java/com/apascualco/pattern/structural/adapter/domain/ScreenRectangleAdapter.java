package com.apascualco.pattern.structural.adapter.domain;

public class ScreenRectangleAdapter implements Rectangle {

    private Screen screen;

    private ScreenRectangleAdapter(final Screen screen) {
        this.screen = screen;
    }

    public static ScreenRectangleAdapter of (final Screen screen) {
        return new ScreenRectangleAdapter(screen);
    }

    @Override
    public int getHeight() {
        return screen.getWith();
    }

    @Override
    public int getWith() {
        return screen.getWith();
    }
}
