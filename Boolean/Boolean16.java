package com.company.Boolean;

import java.util.Scanner;

public class Boolean16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        boolean natija = (a>=10 && a<100 && a%2==0);
        System.out.println(natija);
    }
}
