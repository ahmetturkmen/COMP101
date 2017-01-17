

import java.util.Scanner;

/**
 * Created by ahmetturkmen 
 */
public class programA {


    public static void main(String[]args){

        Scanner read = new Scanner(System.in);
        double x_1=read.nextDouble();
        double y_1=read.nextDouble();
        double x_2=read.nextDouble();
        double y_2=read.nextDouble();
        double x_3=read.nextDouble();
        double y_3=read.nextDouble();

        point2D a= new point2D(x_1,y_1);
        point2D b =new point2D(x_2,y_2);
        point2D c= new point2D(x_3,y_3);

        triangle t1 = new triangle(a,b,c);

        System.out.print(t1.calculateCircumference(a,b,c)+"\n");
        System.out.print(t1.calculateArea(a,b,c));

    }
}

