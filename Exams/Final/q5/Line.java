package com.ahmetturkmen.q5;

/**
 * Created by ahmetturkmen on 1/9/17.
 */
public class Line {
    private Point2d point1;
    private Point2d point2;

    public Line(Point2d p1, Point2d p2) {
        point1 = p1;
        point2 = p2;

    }

    public double calcLength() {
        double length = Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));
        return length;
    }
}
