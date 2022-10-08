package com.company.Switch;

import java.util.Scanner;

public class Case6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Son kiriting = ");
        int a = in.nextInt();
        System.out.println("1-disimetr, 2-kilomet, 3-metr, 4-millimetr, 5-santimtimet");
        int b = in.nextInt();
        switch (b){
            case 1:
                System.out.println(10*a);
                break;
            case 2:
                System.out.println(1000*a);
                break;
            case 3:
                System.out.println(1*a);
                break;
            case 4:
                System.out.println(a/1000);
                break;
            case 5:
                System.out.println(a/100);
                break;
            default:
                System.out.println("Xato");
        }
    }
}
