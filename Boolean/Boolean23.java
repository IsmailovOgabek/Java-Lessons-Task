package com.company.Boolean;

import java.util.Scanner;

public class Boolean23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int d = a%10;
        int c = (a%100)/10;
        int e = a/100;

        boolean natija = (d==e);
        System.out.println(natija);
    }
}
