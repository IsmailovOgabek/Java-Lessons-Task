package com.company.Switch;

import java.util.Scanner;

public class Case3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        switch(a){
            case 1:
            case 2:
                System.out.println("Qish");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Bahor");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yoz");
                break;
            case 9:
            case 10:

            case 11:
                System.out.println("Kuz");
                break;
            case 12:
                System.out.println("Qish");
                break;
            default:
                System.out.println("Bunday oy yo'q");
        }
    }
}
