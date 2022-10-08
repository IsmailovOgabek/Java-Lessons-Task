package com.company.Boolean;

import java.util.Scanner;

public class Boolean1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a%2==0){
            a = a/2;
        } else{
            a = a/2+1;
        }
        if (b%2==0){
            b = b/2;
        } else{
            b = b/2+1;
        }
        if (c%2==0){
            c = c/2;
        } else{
            c = c/2+1;
        }

        System.out.println(a+b+c);

    }
}
