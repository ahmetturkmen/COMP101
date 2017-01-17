

/**
 * Created by ahmetturkmen
 */
public class line2D {
    private point2D a,b;

    public line2D(point2D a, point2D b){
        this.a = a;
        this.b = b;
    }

    public line2D(double x1, double y1, double x2, double y2){
        this.a = new point2D(x1,y1);
        this.b = new point2D(x2,y2);
    }

    public double length(){
        return Math.sqrt(Math.pow(a.x-b.x,2)+Math.pow(a.y-b.y,2));
    }
}


