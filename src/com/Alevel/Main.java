package com.Alevel;

import com.Alevel.fd.*;

class Packer {

    public static void main(String[] args) {

        Box<Food> foodBox = new Box<>();
        Box<Cake> cakeBox = new Box<>();
        Box<Tart> tartBox = new Box<>();
        Box<Bakery> bakeryBox = new Box<>();

        foodBox.put(new Food());
        cakeBox.put(new Cake());
        tartBox.put(new Tart());
        bakeryBox.put(new Bakery());

        repackage(cakeBox, foodBox);
        repackage(foodBox, foodBox);
        repackage(tartBox, foodBox);
        repackage(bakeryBox, foodBox);
    }

    public static void repackage(Box<? extends Food> src, Box<? super Food> dest) {
        dest.put(src.get());
    }
}
