package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        System.out.println("A dan B gacha sonlarni yig'indisi = "+sumRange(a,b));
        System.out.println("C dan D gacha sonlarni yig'indisi = "+sumRange(c,d));
    }
    public static int sumRange(int a, int b){
        int sum = 0;
        if (b>a){
            for (int i = a; i <= b; i++) {
                sum +=i;
            }
            return sum;
        }else
            return 0;

    }
}
