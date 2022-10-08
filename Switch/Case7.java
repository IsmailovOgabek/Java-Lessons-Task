package com.company.Switch;

import java.util.Scanner;

public class Case7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Son kiriting = ");
        int a = in.nextInt();
        System.out.println("1-kilogramm, 2-milligram, 3-gramm, 4-tonna, 5-sentner");
        int b = in.nextInt();
        switch (b){
            case 1:
                System.out.println(a);
                break;
            case 2:
                System.out.println(a/10000);
                break;
            case 3:
                System.out.println(a/1000);
                break;
            case 4:
                System.out.println(a*1000);
                break;
            case 5:
                System.out.println(a*100);
                break;
            default:
                System.out.println("Xato");
        }
    }
}
