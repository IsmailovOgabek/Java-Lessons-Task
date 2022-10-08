package com.company.Switch;

import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Imtihon baxoyingizni kiriting ");
        int k = in.nextInt();
        switch (k){
            case 1:
                System.out.println("1 yomon");
                break;
            case 2:
                System.out.println("2 qoniqarsiz");
                break;
            case 3:
                System.out.println("3 qoniqarli");
                break;
            case 4:
                System.out.println("4 yaxshi");
                break;
            case 5:
                System.out.println("5 a'lo");
                break;
            default:
                System.out.println("xato");
        }
    }
}
