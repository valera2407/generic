package com.Alevel;

import com.Alevel.fd.*;

class Packer {

    public static void main(String[] args) {

        Box<Food> foodBox = new Box<>();
        Box<Cake> cakeBox = new Box<>();
        Box<Tart> tartBox = new Box<>();

        foodBox.put(new Food());
        cakeBox.put(new Cake());
        tartBox.put(new Tart());

        repackage(cakeBox, foodBox);
        repackage(foodBox, cakeBox);
        repackage(foodBox, foodBox);
        repackage(foodBox, tartBox);
    }

    public static void repackage(Box<? super Bakery> src, Box<? extends Goods> dest) {
        dest.put(src.get());
    }
}
