package com.company.Boolean;

import java.util.Scanner;

public class Boolean37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        boolean natija = ((x1==x2+1) ||(x1==x2-1));
        System.out.println(natija);

    }
}
