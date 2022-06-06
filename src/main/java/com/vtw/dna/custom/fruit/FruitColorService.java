package com.vtw.dna.custom.fruit;

public class FruitColorService {

    public String getColor(String fruitName) {
        Fruit fruit = new Fruit(fruitName);
        return fruit.getColor();
    }

}
