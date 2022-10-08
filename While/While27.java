package com.company.While;

import java.util.Scanner;

public class While27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f1 = 1, f2 = 1, f = 0, k = 2, count = 0;
        while (f<n){
            f = f1+f2;
            f1 = f2;
            f2 = f;
            k++;
        }
        System.out.println(k);

    }
}
