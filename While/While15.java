package com.company.While;

import java.util.Scanner;

public class While15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Boshlang'ich summmani kiriting = ");
        double s = in.nextDouble();
        System.out.println("0<p<12 p ni kiriting = ");
        double p = in.nextDouble();
        double sum = s;
        int k =0;
        while (2*sum>s){
            s += p*s/100;
            k++;
            System.out.printf("%d oy -> %.2f%n ",k,s);
        }
        System.out.println((k-1)+" oydan keyin boshlang'ich summa 2 barobar ortadi");

    }
}
