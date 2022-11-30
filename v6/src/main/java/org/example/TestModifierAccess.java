package org.example;

public class TestModifierAccess {
    public int a;
    private int b;
    protected int c;

    public int a() {
        return a;
    }

    public int b() {
        return b;
    }

    public int c() {
        return c;
    }
}
