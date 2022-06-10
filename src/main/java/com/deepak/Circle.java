package com.deepak;

import processing.core.PApplet;

public class Circle extends Shape{
    private int diameter;


    public Circle(int startX, int startY, int speed, int diameter) {
        super(startX, startY, speed);
        this.diameter = diameter;
    }


    public int getDiameter() {
        return diameter;
    }


}
