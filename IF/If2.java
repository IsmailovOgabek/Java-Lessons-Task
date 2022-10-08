package com.company.IF;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println((a>0)? a+1 : a-2);
    }
}
