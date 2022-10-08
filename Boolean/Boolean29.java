package com.company.Boolean;

import java.util.Scanner;

public class Boolean29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        boolean natija = (x<x2 && x>x1 && y<y1 && y>y2);
        System.out.println(natija);

    }
}
