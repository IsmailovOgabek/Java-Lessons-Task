package com.company.For;

import java.util.Scanner;

public class For7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int s = 0;
        for (int i = a; i <= b; i++) {
            s +=i;
        }
        System.out.println(s);
    }
}
