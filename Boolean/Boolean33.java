package com.company.Boolean;

import java.util.Scanner;

public class Boolean33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean natija = (a<(c+b) && b<(a+c) && c<(b+a));
        System.out.println(natija);
    }
}
