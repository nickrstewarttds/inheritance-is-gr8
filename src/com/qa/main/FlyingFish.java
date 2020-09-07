package com.qa.main;

public class FlyingFish extends Fish implements Flyable {

    @Override
    public String fly() {
        return "imma flyin fishie";
    }

    @Override
    public String swim() {
        return "imma swimmyboi";
    }

}
