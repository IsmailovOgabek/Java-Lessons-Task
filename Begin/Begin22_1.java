package com.company.Begin;

import java.util.Scanner;

public class Begin22_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Birinchi sonni kiriting = ");
        int a = in.nextInt();
        System.out.print("Ikkinchi sonni kiriting = ");
        int b = in.nextInt();
        System.out.println("Birinchi sonni "+((a+b)-a));
        System.out.println("Birinchi sonni "+((a+b)-b));
    }
}
