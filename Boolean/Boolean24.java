package com.company.Boolean;

import java.util.Scanner;

public class Boolean24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean natija = ((b*b-4*a*c)>=0);
        System.out.println(natija);

    }
}
