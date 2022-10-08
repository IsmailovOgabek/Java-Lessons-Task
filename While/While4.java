package com.company.While;

import java.util.Scanner;

public class While4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n>0 n = ");
        int n = in.nextInt();
        while (n>=3){
            n /= 3;
        }
        if (n==1){
            System.out.println("3-ning darajasi");
        }else {
            System.out.println("3-ning darajasi emas");
        }
    }
}
