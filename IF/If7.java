package com.company.IF;

import java.util.Scanner;

public class If7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a<b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
