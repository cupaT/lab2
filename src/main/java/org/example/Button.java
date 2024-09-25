package org.example;

public class Button {
    private int clicks;

    Button() {
        this(0);
    }

    public Button(int i) {
        this.clicks = i;
    }

    public void click() {
        clicks += 1;
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }
}