package com.company.Integet;

import java.util.Scanner;

public class Integer28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int kun = (k+(n-1))%7;
        System.out.println(kun);
    }
}
