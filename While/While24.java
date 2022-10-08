package com.company.While;

import java.util.Scanner;

public class While24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f1 = 1, f2 = 1, f = 0, k = 3, count = 0;
        while (k<=n){
            f = f1+f2;
            if (n == f){
                count++;
            }
            f1 = f2;
            f2 = f;
            k++;
        }
        if (count>0){
            System.out.println(n+" Fibonachi sonlar orasida Bor");
        }else{
            System.out.println(n+" Fibonachi sonlar orasida Yo'q");
        }
    }
}
