package com.company.IF;

import java.util.Scanner;

public class If3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a>0){
            a += 1;
            System.out.println(a);
        }else if (a<0){
            a -= 2;
            System.out.println(a);
        }else{
            a = 10;
            System.out.println(a);
        }

    }
}
