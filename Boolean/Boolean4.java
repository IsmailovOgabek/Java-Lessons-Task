package com.company.Boolean;

import java.util.Scanner;

public class Boolean4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        boolean natija = (a>2 && b<=3);
        System.out.println(natija);
    }
}
