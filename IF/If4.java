package com.company.IF;

import java.util.Scanner;

public class If4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a>0 && b>0 && c>0){
            System.out.println(" 3 ta musbat");
        }else if ((a>0 && b>0 && c<0) ||(a>0 && b<0 && c>0) || (a<0 && b<0 && c>0)){
            System.out.println("2 ta musbat");
        }else if ((a>0 && b<0 && c<0) || (a<0 && b>0 && c<0) || (a<0 && b<0 && c>0)){
            System.out.println("1 ta musbat");
        }
    }
}
