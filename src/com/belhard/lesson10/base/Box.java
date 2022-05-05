package com.belhard.lesson10.base;

public class Box<T> {
    private T t;

    public Box(T t) {
        this.t = t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    @Override
    public String toString() {
        return "Box{" +
                "t=" + t +
                '}';
    }
}
