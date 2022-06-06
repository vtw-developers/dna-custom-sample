package com.vtw.dna.custom.fruit;

public class Fruit {

    private String name;
    private String color;

    public Fruit(String name) {
        this.name = name;

        if (name.equals("apple")) {
            this.color = "red";
        } else if (name.equals("banana")) {
            this.color = "yellow";
        }
    }

    public String getColor() {
        return this.color;
    }

}
