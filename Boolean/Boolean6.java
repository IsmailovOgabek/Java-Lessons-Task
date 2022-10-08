package com.company.Boolean;

import java.util.Scanner;

public class Boolean6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextInt();
        boolean natija = (a<=b && b<=c);
        System.out.println(natija);
    }
}
