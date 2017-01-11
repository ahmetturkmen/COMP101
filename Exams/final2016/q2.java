package com.ahmetturkmen;

import java.util.Scanner;

/**
 * Created by ahmetturkmen on 1/9/17.
 */
public class q2_16 {

    public static void main(String [] args){

        Scanner read = new Scanner(System.in);
        int numPod= read.nextInt();
        double [] products = new double[numPod];
        double idealVal = read.nextDouble();
        double toILevel=read.nextDouble();
        
        double lowerBoundary= idealVal-(idealVal*toILevel);
        double upperBoundary = idealVal+(idealVal*toILevel);

        for (int i = 0; i <numPod ; i++) {
            products[i]=read.nextDouble();
            if(products[i]<lowerBoundary || products[i]>upperBoundary)
                System.out.print((i+1)+" ");

        }

    }

}
