package com.company.Switch;

import java.util.Scanner;

public class Case9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Kunni kiriting = ");
//        int a = in.nextInt();
//        System.out.print("Oyni kiriting = ");
//        int b = in.nextInt();
        int d = in.nextInt();
        int m = in.nextInt();
        switch (m) {
            case 1:
                if((d+1)>31){
                    System.out.println("1 - fevral");
                    break;
                }
                System.out.println(d+1 + " - Yanvar");
                break;
            case 2:
                if((d+1)>28){
                    System.out.println("1 - Mart");
                    break;
                }
                System.out.println(d+1 + " - Fevral");
                break;
            case 3:
                if((d+1)>31){
                    System.out.println("1 - Aprel");
                    break;
                }
                System.out.println(d+1 + " - Mart");
                break;
            case 4:
                if((d+1)>30){
                    System.out.println("1 - May");
                    break;
                }
                System.out.println(d+1 + " - Aprel");
                break;
            case 5:
                if((d+1)>31){
                    System.out.println("1 - Iyun");
                    break;
                }
                System.out.println(d+1 + " - May");
                break;
            case 6:
                if((d+1)>30){
                    System.out.println("1 - Iyul");
                    break;
                }
                System.out.println(d + " - Iyun");
                break;
            case 7:
                if((d+1)>31){
                    System.out.println("1 - Avgust");
                    break;
                }
                System.out.println(d+1 + " - Iyul");
                break;
            case 8:
                if((d+1)>31){
                    System.out.println("1 - Sentabr");
                    break;
                }
                System.out.println(d+1 + " - Avgus");
                break;
            case 9:
                if((d+1)>30){
                    System.out.println("1 - Oktabr");
                    break;
                }
                System.out.println(d+1 + " - Sentabr");
                break;
            case 10:
                if((d+1)>31){
                    System.out.println("1 - Noyabr");
                    break;
                }
                System.out.println(d+1 + " - Oktabr");
                break;
            case 11:
                if((d+1)>30){
                    System.out.println("1 - Dekabr");
                    break;
                }
                System.out.println(d+1 + " - Nayabr");
                break;
            case 12:
                if((d+1)>31){
                    System.out.println("1 - Yanvar");
                    break;
                }
                System.out.println(d+1 + " - Dekabr");
                break;
            default:
                System.out.println("Xato");
        }

    }
}
