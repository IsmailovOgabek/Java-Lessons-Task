package com.company.Funksiya;

import java.util.Scanner;

public class FunSimple30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int n = in.nextInt();
        System.out.println(digtN(k, n));

    }

    public static int digtN(int k, int n) {
        int i = 0;
        int b = k;
        int count = 1;
        while (k > 0) {
            i = k % 10;
            k = k / 10;
            count++;
        }
        while (b > 0) {
            i = b % 10;
            b = b / 10;
            count--;
            if (n == count) {
                i = i;
                break;
            }
        }
        return i;
    }
}
