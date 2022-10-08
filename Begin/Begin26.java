package com.company.Begin;

import java.util.Scanner;

public class Begin26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            double x = in.nextDouble();
            double y = 4 * Math.pow((x-3),6) - 7 * Math.pow((x-3),3) + 2;
        System.out.println("Y = "+y);

    }
}
