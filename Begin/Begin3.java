package com.company.Begin;

import java.util.Scanner;

public class Begin3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("To'g'ri to'rtburchakning a tomonini kiriting = ");
        int a = in.nextInt();
        System.out.print("To'g'ri to'rtburchakning b tomonini kiriting = ");
        int b = in.nextInt();
        int S = a * b;
        int P  = 2*(a + b);
        System.out.println("To'g'ri to'rtburchakning yuzasi = " +S);
        System.out.println("To'g'ri to'rtburchakning perimetri = " +P);
    }
}
