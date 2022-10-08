package com.company.Boolean;

import java.util.Scanner;

public class Boolean19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        boolean natija = ((a==-(b) || b==-(c) || a==-(c)));
        System.out.println(natija);
    }
}
