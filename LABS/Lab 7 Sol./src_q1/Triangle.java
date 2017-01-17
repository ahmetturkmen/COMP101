package LAB11.Q1;



/**
 * Created by ahmetturkmen on 1/17/17.
 */
public class Triangle {

    point2D A;
    point2D B;
    point2D C;

    public Triangle(point2D A, point2D B, point2D C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }



    public double calculateArea(point2D A, point2D B, point2D C){
        line2D k = new line2D(A,B);
        line2D l = new line2D(A,C);
        line2D m =new line2D(B,C);

        double s = (k.length()+l.length()+m.length())/2;
        double area = (Math.sqrt(s*(s-k.length())*(s-l.length())*(s-m.length())));
        return area;
    }
    public double calculateCircumference(point2D A,point2D B,point2D C){
        line2D k = new line2D(A,B);
        line2D l = new line2D(A,C);
        line2D m =new line2D(B,C);

        double circumference = k.length()+l.length()+m.length();
        return circumference;
    }


}
