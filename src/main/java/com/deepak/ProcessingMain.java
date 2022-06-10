package com.deepak;

import processing.core.PApplet;

public class ProcessingMain extends PApplet {
    BoardSize boardSize = new BoardSize(640,480);
    Circle circle1 = new Circle(0, boardSize.getWidth() /5,1, 10);
    Circle circle2 = new Circle(0, (2 * boardSize.getWidth() /5),2, 10);
    Circle circle3 = new Circle(0, (3 * boardSize.getWidth() /5),3, 10);
    Circle circle4 = new Circle(0, (4 * boardSize.getWidth() /5),4, 10);

    public static void main(String[] args) {
        PApplet.main("com.deepak.ProcessingMain", args);
    }

    @Override
    public void draw() {
        drawCircle(circle1);
        circle1.changeStartPositionBySpeed();
        drawCircle(circle2);
        circle2.changeStartPositionBySpeed();
        drawCircle(circle3);
        circle3.changeStartPositionBySpeed();
        drawCircle(circle4);
        circle4.changeStartPositionBySpeed();

    }

    @Override
    public void settings() {
        super.settings();
        size(boardSize.getWidth(),boardSize.getHeight());
    }

    @Override
    public void setup() {
        super.setup();

    }

    public void drawCircle(Circle circle){
            ellipse(circle.getStartX(), circle.getStartY(), circle.getDiameter(), circle.getDiameter());
    }
}
