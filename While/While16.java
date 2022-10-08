package com.company.While;

import java.util.Scanner;

public class While16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Brinchi kun 10 km yugurgan bo'lsa ");
        double s = 10;
        System.out.print("har kuni p% ko'p yugursa = ");
        double p = in.nextDouble();
        double sum = s;
        int k = 1;
        while (200 > s) {
            k++;
            s += p * s / 100;
            System.out.printf("%d kun -> %.2f%n", k, s);
        }
        System.out.println("\n"+(k-1)+" kundan keyin 200 km dan ortadi");
    }
}