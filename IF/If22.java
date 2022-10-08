package com.company.IF;

import java.util.Scanner;

public class If22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("OX va OY koordinata o'qlarida yotmaydigan nuqta kiriting");
        System.out.print("x = ");
        int x = in.nextInt();
        System.out.print("y = ");
        int y = in.nextInt();

        if (x>0 && y>0){
            System.out.println("I chorakda");
        }else if (x<0 && y>0){
            System.out.println("II chorakda");
        }else if (x<0 && y<0){
            System.out.println("III chorak");
        }else if (x>0 && y<0){
            System.out.println("IV chorak");
        }
    }
}
