package com.company.Massivlar;

import java.util.Scanner;

public class Array16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print("a["+i+"] -> "+a[i]+"\t");
            System.out.print("a["+(a.length-i-1)+"] -> "+a[a.length-i-1]+"\t");
        }


    }
}
