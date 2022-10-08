package com.company.Begin;

import java.util.Scanner;

public class Begin25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            double y = 3 * Math.pow(x,6) + 6 * Math.pow(x,2) - 7;
        System.out.println("Y = "+y);
    }
}
