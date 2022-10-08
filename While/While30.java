package com.company.While;

import java.util.Scanner;

public class While30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("To'g'ri to'rt burchakning a tomoni kiriting = ");
        double a = in.nextInt();
        System.out.print("To'g'ri to'rt burchakning b tomoni kiriting = ");
        double b = in.nextInt();
        System.out.print("Kvadratning burchakning c tomoni kiriting = ");
        double c = in.nextInt();
        double tortburchakniYuzi = a*b;
        double kvadratYuzi = c*c;
        int k = 0;
        while (tortburchakniYuzi>=kvadratYuzi){
            tortburchakniYuzi -= kvadratYuzi;
            k++;
        }
        System.out.printf("Bitta to'rg'ri to'rtburchakga %d ta kvadratni joylashitirish mumkin ",k);

    }
}
