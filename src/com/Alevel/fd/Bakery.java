package com.Alevel.fd;

public class Bakery extends Food {
    private String doughIngridients;

    public String getDoughIngridients() {
        return doughIngridients;
    }

    public void setDoughIngridients(String doughIngridients) {
        this.doughIngridients = doughIngridients;
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
