package com.company.While;

import java.util.Scanner;

public class While28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double e = in.nextInt();
        int k = 0;
        double a1 = 2;
        double a2 = 0, a3 = 0;
        while (k<=e){
            a2 = 2+1/a1;
            if (Math.abs(a2-a1)<e){
                System.out.println(k);
            }
            k++;
        }


    }
}
