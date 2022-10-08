package com.company.Boolean;

import java.util.Scanner;

public class Boolean21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        boolean natija = (a+1 == b && b+1 == c);
        System.out.println(natija);
    }
}
