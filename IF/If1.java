package com.company.IF;

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a>0){
            a = a+1;
            System.out.println(a);
        }else {
            System.out.println(a);
        }
    }
}
