package com.apascualco.pattern.structural.adapter.domain;

public class Screen implements Square {

    private int with;

    public Screen(int with) {
        this.with = with;
    }

    @Override
    public int getWith() {
        return this.with;
    }

}
