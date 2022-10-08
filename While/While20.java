package com.company.While;

import java.util.Scanner;

public class While20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a =0;
        int k = 0;
        while (n>1) {
            a = n % 10;
            n = n / 10;
            if (a == 2){
               k++;
            }
        }
        if (k>0){
            System.out.println("raqamlari orasida 2 bor");
        }else
            System.out.println("raqamlari orasida 2 yo'q");
    }
}
