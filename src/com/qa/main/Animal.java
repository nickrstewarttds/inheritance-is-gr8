package com.qa.main;

public class Animal {

    private String name;
    private int eyes;
    private String diet;
    private String shape;

    public Animal() {
        this.name = "Johnny the amazing wonderhorse";
    }

    public Animal(int eyes, String diet, String shape) {
        super();
        this.eyes = eyes;
        this.diet = diet;
        this.shape = shape;
    }

    public Animal(String name, int eyes, String diet, String shape) {
        super();
        this.name = name;
        this.eyes = eyes;
        this.diet = diet;
        this.shape = shape;
    }

    public String speak() {
        return "generic animal noises";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", eyes=" + eyes + ", diet=" + diet + ", shape=" + shape + ", speak()="
                + speak() + "]";
    }

}
