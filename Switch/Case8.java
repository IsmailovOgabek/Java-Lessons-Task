package com.company.Switch;

import java.util.Scanner;

public class Case8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();
        int m = in.nextInt();
        switch (m){
            case 1:
                System.out.println(d+" - Yanvar");
                break;
            case 2:
                System.out.println(d+" - Fevral");
                break;
            case 3:
                System.out.println(d+" - Mart");
                break;
            case 4:
                System.out.println(d+" - Aprel");
                break;
            case 5:
                System.out.println(d+" - May");
                break;
            case 6:
                System.out.println(d+" - Iyun");
                break;
            case 7:
                System.out.println(d+" - Iyul");
                break;
            case 8:
                System.out.println(d+" - Avgus");
                break;
            case 9:
                System.out.println(d+" - Sentabr");
                break;
            case 10:
                System.out.println(d+" - Oktabr");
                break;
            case 11:
                System.out.println(d+" - Nayabr");
                break;
            case 12:
                System.out.println(d+" - Dekabr");
                break;
            default:
                System.out.println("Xato");
        }

    }
}
