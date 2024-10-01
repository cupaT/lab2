package org.example;

public class Balance {
    private int leftWeight;
    private int rightWeight;

    public Balance() {
        this.leftWeight = 0;
        this.rightWeight = 0;
    }

    public void addLeft(int weight) {
        this.leftWeight += weight;
    }

    public void addRight(int weight) {
        this.rightWeight += weight;
    }

    public String result() {
        if (leftWeight > rightWeight) {
            return "L";
        } else if (rightWeight > leftWeight) {
            return "R";
        } else {
            return "=";
        }
    }
}
