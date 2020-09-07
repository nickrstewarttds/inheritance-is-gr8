package com.qa.main;

public class Fish extends Animal implements Swimable {
    private int gills;

    public int getGills() {
        return gills;
    }

    public void setGills(int gills) {
        this.gills = gills;
    }

    // overriding an INHERITED method from Animal
    @Override
    public String speak() {
        return "glub glub";
    }

    // overriding an IMPLEMENTED abstract method from Swimable
    @Override
    public String swim() {
        return "imma do a bige s w i m b";
    }

}
