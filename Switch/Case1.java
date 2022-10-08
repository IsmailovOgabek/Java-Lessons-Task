package com.company.Switch;

import java.util.Scanner;

public class Case1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1-7 gacha bo'lgan son kiritilsin ");
        int a = in.nextInt();
        switch (a){
            case 1:
                System.out.println("Dushanba");
                break;
            case 2:
                System.out.println("Seshanba");
                break;
            case 3:
                System.out.println("Chorchanba");
                break;
            case 4:
                System.out.println("Payshanba");
                break;
            case 5:
                System.out.println("Juma");
                break;
            case 6:
                System.out.println("Shanba");
                break;
            case 7:
                System.out.println("Yakshanaba");
                break;
            default:
                System.out.println("Bunday hafta kuni yo'q");
        }


    }
}
