package com.deepak;

import processing.core.PApplet;

public class BoardSize {
    final int height;
    final int width;

    BoardSize(int height, int width){
        this.height = height;
        this.width = width;
    }
//
//    public void callSettings(){
//        settings();
//        setup();
//    }

//    @Override
//    public void setup() {
//    }
//
//    @Override
//    public void settings() {
//        size(width, height);
//    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
