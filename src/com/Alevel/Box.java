package com.Alevel;

import com.Alevel.fd.Goods;

public class Box <T extends Goods>{
    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }
}
