package com.company.Massivlar;

import java.util.Scanner;

public class Array9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int count = 0;
        for (int i = (a.length-1); i >= 0; i--) {
            if (a[i]%2==0){
                System.out.print(a[i]+" ");
                count++;
            }
        }
        System.out.println("Juft sonlar "+count+" ta");
    }
}
