package com.company.Massivlar;

import java.util.Scanner;

public class Array44 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
            int indexBir = 0, indexIkki = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                boolean d = a[i]==a[j];
                if (d){
                    indexBir = i;
                    indexIkki = j;
                    System.out.println(indexBir+" indexsdagi va "+indexIkki +" indexsdagi qiymatlar biri biriga teng");
                }
            }
        }


    }
}
