package com.company.IF;

import java.util.Scanner;

public class If27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        if (x  < 0) {
            System.out.println(0);
        }
        else if((int)x % 2 == 0){
            System.out.println(1);
        }
        else {
            System.out.println(-1);
        }
    }
}
