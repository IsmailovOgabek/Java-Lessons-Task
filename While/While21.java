package com.company.While;

import java.util.Scanner;

public class While21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0, k = 0;
        while (n>=1){
            a = n%10;
            n = n/10;
            if (a%2==1){
                k++;
            }
        }
        if (k>0){
            System.out.println("Raqamlar orasida toq son Bor");
        }else {
            System.out.println("Raqamlar orasida toq son Yo'q ");
        }

    }
}
