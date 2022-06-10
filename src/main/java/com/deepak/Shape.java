package com.deepak;

public abstract class Shape {
    private int startX;

    private int startY;

    private int speed;

    public Shape(int startX, int startY, int speed) {
        this.startX = startX;
        this.startY = startY;
        this.speed = speed;
    }

    public int getStartX() {
        return startX;
    }

    public int getStartY() {
        return startY;
    }

    public int getSpeed() {
        return speed;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void changeStartPositionBySpeed(){
        setStartX(getStartX() + getSpeed());
    }
}
