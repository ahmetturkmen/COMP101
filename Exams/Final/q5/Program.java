package com.ahmetturkmen.q5;

/**
 * Created by ahmetturkmen on 1/9/17.
 */
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();



        double y4 = input.nextDouble();
        input.close();
        Point2d point1 = new Point2d(x1,y1);
        Point2d point2 = new Point2d(x2,y2);
        Point2d point3 = new Point2d(x3,y3);
        Point2d point4 = new Point2d(x4,y4);
        Square square = new Square(point1,point2,point3,point4);
        System.out.printf("%f",square.calculateCircumference());
        System.out.printf(" %f", square.calculateDiagonal());
    }
}
