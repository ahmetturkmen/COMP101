

/**
 * Created by ahmetturkmen 
 */
public class IP_addr {

    int A,B,C,D;

    public IP_addr(int A,int B, int C,int D){

        if(A>255 && A<0){
            A=0;
        }else if(B>255 && B<0){
            B=0;
        }else if (C>255 && B<0){
            C=0;
        }else if (D>255 && D<0) {
            D = 0;
        }

    }

}
