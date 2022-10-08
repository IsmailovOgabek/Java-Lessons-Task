package com.company.Boolean;

import java.util.Scanner;

public class Boolean9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        boolean natija = (a%2!=0 || b%2!=0);
        System.out.println(natija);
    }
}
