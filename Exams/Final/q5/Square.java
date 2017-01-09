package com.ahmetturkmen.q5;

/**
 * Created by ahmetturkmen on 1/9/17.
 */

public class Square {

    Point2d point1, point2, point3, point4;


    public Square(Point2d point1, Point2d point2, Point2d point3, Point2d point4) {

        setPoint1(point1);
        setPoint2(point2);
        setPoint3(point3);
        setPoint4(point4);
    }

    public void setPoint1(Point2d point1) {
        this.point1 = point1;
    }

    public void setPoint2(Point2d point2) {
        this.point2 = point2;
    }

    public void setPoint3(Point2d point3) {
        this.point3 = point3;
    }

    public void setPoint4(Point2d point4) {
        this.point4 = point4;
    }

    public double calculateCircumference() {

        Line line = new Line(point2, point1);


        double circumference = line.calcLength() * 4;


        return circumference;

    }


    public double calculateDiagonal() {
        Line line = new Line(point2, point1);

        double hipotenus = Math.sqrt(2 * Math.pow(line.calcLength(), 2));

        return hipotenus;

    }
}
