package com.company.Switch;

import java.util.Scanner;

public class Case4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        switch (a){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 kundan iborat");
                break;
            case 2:
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 kundan iborat");
                break;
            default:
                System.out.println("bunday oy yo'q");
        }
    }
}
