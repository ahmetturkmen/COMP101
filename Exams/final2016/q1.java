package com.ahmetturkmen;

import java.util.Scanner;

/**
 * Created by ahmetturkmen on 1/9/17.
 */
public class q1_16 {
    public  static void main(String [] args){

        char groupType,groupInst;
        int groupNbr,cost;

        Scanner read = new Scanner(System.in);
        groupType=read.next().charAt(0);
        groupInst=read.next().charAt(0);
        groupNbr=read.nextInt();

        if(groupType =='N'){
            System.out.println("No admittance");

        }else if (groupType == 'U'&& groupInst=='A'){
            cost=0;
            System.out.println(cost);
        }else if (groupType == 'U' ){
            cost = groupNbr*10;
            System.out.println(cost);
        }

    }
}
