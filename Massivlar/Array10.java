package com.company.Massivlar;

import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i]%2==0){
                System.out.print(a[i]+" ");
                count2++;
            }
        }
        System.out.println("Juft sonlar "+count2+" ta");

        int count1 = 0;
        for (int i = (a.length-1); i >= 0; i--) {
            if (a[i]%2==1){
                System.out.print(a[i]+" ");
                count1++;
            }
        }
        System.out.println("Toq sonlar "+count1+" ta");


    }
}
