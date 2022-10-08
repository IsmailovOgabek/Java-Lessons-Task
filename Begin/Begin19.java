package com.company.Begin;

import java.util.Scanner;

public class Begin19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("A nuqtaning kordinotalarni kiriting = ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.println("B nuqtaning kardinotalarni kiriting = ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int a_tomon = y2-y1;
        int b_tomon = x2-x1;
        int P = 2 * (a_tomon + b_tomon);
        int S = a_tomon*b_tomon;
        System.out.println("P = "+P);
        System.out.println("S = "+S);


    }
}
