package com.company.While;

import java.util.Scanner;

public class While8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        int k = 1;
        while (k*k<=n){
            k++;
        }
        System.out.println(k-1);

    }
}
