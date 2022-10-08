package com.company.Boolean;

import java.util.Scanner;

public class Boolean31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean natija = (a<(c+b) && b<(a+c) && c<(b+a) && (a==b && a==c));
        System.out.println(natija);
    }
}
