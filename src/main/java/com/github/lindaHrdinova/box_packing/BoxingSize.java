package com.github.lindaHrdinova.box_packing;

public class BoxingSize {
    private double sideA;
    private double sideB;
    private double sideC;
    private double finalSize;

    public double getSideA() {
        return sideA;
    }

    public String setSideA(double sideA) {
        this.sideA = sideA;
        return null;
    }

    public double getSideB() {
        return sideB;

    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getFinalSize() {
        return finalSize;
    }

    public void setFinalSize(double finalSize) {
        this.finalSize = finalSize;
    }
}
