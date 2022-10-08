package com.company.Boolean;

import java.util.Scanner;

public class Boolean32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean natija = (a == Math.sqrt(b*b+ c*c));
        System.out.println(natija);
    }
}
