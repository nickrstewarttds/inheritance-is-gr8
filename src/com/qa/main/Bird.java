package com.qa.main;

public class Bird extends Animal {
    private String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public String speak() {
        return "tweet tweet yo";
    }

    @Override
    public String toString() {
        return "Bird [song=" + song + ", speak()=" + speak() + "]";
    }

}
