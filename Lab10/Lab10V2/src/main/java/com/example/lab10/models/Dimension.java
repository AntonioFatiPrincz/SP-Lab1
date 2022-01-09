package com.example.lab10.models;

public class Dimension {
    private int lungime;
    private int latime;

    public Dimension(int lungime, int latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public int getLatime() {
        return latime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }
}
