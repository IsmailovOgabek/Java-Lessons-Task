package com.company.Boolean;

import java.util.Scanner;

public class Boolean5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        boolean natija = (a>=0 && b<-2);
        System.out.println(natija);
    }
}
