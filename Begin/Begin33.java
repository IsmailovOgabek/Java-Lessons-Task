package com.company.Begin;

import java.util.Scanner;

public class Begin33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("X ni qiymatini kiriting = ");
        int X = in.nextInt();
        System.out.println("A ni qiymatini kiriting = ");
        int A = in.nextInt();
        double birKilogromNarhi = X/A;
        System.out.println("Bir kiligrom konfet narhi = "+birKilogromNarhi);
        System.out.println("Y ni kiriting = ");
        int Y = in.nextInt();
        double yKilogromNarxi = birKilogromNarhi*Y;
    }
}
