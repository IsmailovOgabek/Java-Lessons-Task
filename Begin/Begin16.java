package com.company.Begin;

import java.util.Scanner;

public class Begin16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Birinchi nuqtani kiriting");
        double X1 = in.nextInt();
        System.out.print("Ikkinchi nuqtani kiriting");
        double X2 = in.nextInt();
        System.out.println(Math.abs(X1-X2));
    }
}
