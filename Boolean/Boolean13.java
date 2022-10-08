package com.company.Boolean;

import java.util.Scanner;

public class Boolean13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        boolean natija = (a>0 || b>0 || c>0);
        System.out.println(natija);
    }
}
