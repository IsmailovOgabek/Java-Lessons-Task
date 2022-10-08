package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            int a = in.nextInt();
            digitCountSum(a);
        }
    }
    public static void digitCountSum(int a){
        int i = 0, count = 0;
        while (a>0){
            i += a%10;
            a = a/10;
            count++;
        }
        System.out.println("Sonning raqamlari yig'indi = "+i);
        System.out.println("Raqamlari soni = "+count);
    }
}
