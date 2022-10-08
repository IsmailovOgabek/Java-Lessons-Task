package com.company.Switch;

import java.util.Scanner;

public class Case5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1-qo'shish, 2- ayirish, 3-bo'lish, 4-ko'paytirish");
        System.out.print("A =");
        int a = in.nextInt();
        System.out.print("B = ");
        int c = in.nextInt();
        System.out.print("ishorani tanlang =");
        int b = in.nextInt();
        switch (b){
            case 1:
                System.out.println(a+c);
                break;
            case 2:
                System.out.println(a-c);
                break;
            case 3:
                System.out.println(a/c);
                break;
            case 4:
                System.out.println(a*c);
                break;
        }
    }
}
