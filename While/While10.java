package com.company.While;

import java.util.Scanner;

public class While10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        int k = 1;
        while (Math.pow(3,k)<=n){
            k++;
        }
        System.out.println("3 ning "+(k-1)+" darajasi "+Math.pow(3,k-1)+" -> "+n+" dan kichik");
    }
}

