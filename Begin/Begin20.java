package com.company.Begin;

import java.util.Scanner;

public class Begin20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("A nuqtaning kordinotalarni kiriting = ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.println("B nuqtaning kardinotalarni kiriting = ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        System.out.println(Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));

    }
}
