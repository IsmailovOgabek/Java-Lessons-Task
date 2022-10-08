package com.company.For;

import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1 kg konfetning narxinikiriting =  ");
        int narx = in.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i+" "+narx*i);
        }
    }
}
