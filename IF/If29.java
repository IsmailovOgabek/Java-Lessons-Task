package com.company.IF;

import java.util.Scanner;

public class If29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a>0 && a%2==1){
            System.out.println(a+" musbat toq son");

        }else if (a>0 && a%2==0){
            System.out.println(a+" musbat juft son");

        } else if (a<0 && a%2==0){
            System.out.println(a+" manfiy juft son");

        }else if (a<0 && a%2==-1){
            System.out.println(a+" manfiy toq son");

        }else {
            System.out.println("son 0 ga teng");
        }
    }
}
