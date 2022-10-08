package com.company.While;

import java.util.Scanner;

public class While18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        while (n>=1){
            a = n%10;
            n = n/10;
            System.out.print(a);
        }


    }
}
