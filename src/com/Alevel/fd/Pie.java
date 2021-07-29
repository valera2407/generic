package com.Alevel.fd;

import com.Alevel.fd.Bakery;

public class Pie extends Bakery {
    private String fruits;

    public String getFruits() {
        return fruits;
    }

    public void setFruits(String fruits) {
        this.fruits = fruits;
    }

    @Override
    public String getDoughIngridients() {
        return super.getDoughIngridients();
    }

    @Override
    public void setDoughIngridients(String doughIngridients) {
        super.setDoughIngridients(doughIngridients);
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    @Override
    public String getSize() {
        return super.getSize();
    }

    @Override
    public void setSize(String size) {
        super.setSize(size);
    }
}
