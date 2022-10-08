package com.company.IF;

import java.util.Scanner;

public class If21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x = ");
        int x = in.nextInt();
        System.out.print("y = ");
        int y = in.nextInt();
        if (x==0 && y==0){
            System.out.println(0);
        }else if (x==0 || y==0){

            if (x!=0){
                System.out.println(1);
            }else{
                System.out.println(2);
            }
        }else{
            System.out.println(3);
        }
    }
}
