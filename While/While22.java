package com.company.While;

import java.util.Scanner;

public class While22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 2, d = 0, b = 0;
        while (n>2*k){
            k++;
            if (n%k == 0){
              d++;
            }
        }
        if (d==0){
            System.out.println(n+" tub son");
        }else {
            System.out.println(n+" tub son emas");
        }
    }
}
