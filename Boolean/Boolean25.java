package com.company.Boolean;

import java.util.Scanner;

public class Boolean25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        boolean natija = (x<0 && y>0);
        System.out.println(natija);
    }
}
