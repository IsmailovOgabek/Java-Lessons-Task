package com.company.While;

import java.util.Scanner;

public class While17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = 0;
        while (n>m){
            n -= m;
            k++;
        }
        System.out.println(k+" butun qisim "+n+" qoldiq");
    }
}
