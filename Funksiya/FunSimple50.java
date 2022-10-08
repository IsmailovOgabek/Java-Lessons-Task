package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple50 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            int t = in.nextInt();
            int[] natija = time1(t);
            System.out.println(natija[0]+":"+natija[1]+":"+natija[2]);
        }
    }
   public static int[] time1(int t){
        int[] a = new int[3];
        a[0] = t/3600;
        a[1] = (t % 3600)/60;
        a[2] = (t % 3600)%60;
        return a;
    }
}
