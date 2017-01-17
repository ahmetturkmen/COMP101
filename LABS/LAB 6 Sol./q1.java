package LAB6;

import java.util.Scanner;

/**
 * Created by ahmetturkmen
 */
public class q1 {

    public static void main(String[] args) {

        int[] array1 = new int[5];
        int[] array2 = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i <array1.length ; i++) {
            array1[i]=in.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i]=in.nextInt();
        }
        int[] sum = new int[array1.length + 1];
        int n = array1.length + 1;
        int m = array1.length;
        int aux = 0;
        int i;

        for (i = 1; i <= m; i++) {
            if (array1[m - i] + array2[m - i] == 2) {
                sum[n - i] = 0 + aux;
                aux = 1;
                continue;

            } else {
                if (array1[m - i] + array2[m - i] + aux == 2) {
                    sum[n - i] = 0;
                    aux = 1;
                    continue;
                } else {
                    sum[n - i] = array1[array1.length - i] + array2[array2.length - i] + aux;
                    aux = 0;
                }


            }

        }
        if (aux == 1)
            sum[0] = 1;
        else
            sum[0] = 0;
        for (i = 0; i < sum.length; i++)
            System.out.print(sum[i]);


    }
}
