package com.company.While;

import java.util.Scanner;

public class While5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("2 ning biror darajasi bo'lgan son kiriting = ");
        int n = in.nextInt();
        int k = 0;
        while (n>=2){
            n /= 2;
            k++;
        }
        System.out.printf("2 ning %d chi darajasi",k);
    }
}
