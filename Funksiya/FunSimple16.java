package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
         int a = in.nextInt();
            int b = ishora(a);
            System.out.println(b);
        }
    }
    public static int ishora(int a){
        if (a<0){
            return -1;
        }else if (a>0){
            return 1;
        }else
            return 0;
    }
}
