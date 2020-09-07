package com.qa.main;

public class Penguin extends Bird implements Swimable {
    private boolean isEmperor;

    public boolean isEmperor() {
        return isEmperor;
    }

    public void setEmperor(boolean isEmperor) {
        this.isEmperor = isEmperor;
    }

    @Override
    public String speak() {
        return "noot noot";
    }

    @Override
    public String swim() {
        return "imma pengy that can swimbbbbbb";
    }

}
