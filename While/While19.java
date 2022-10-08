package com.company.While;

import java.util.Scanner;

public class While19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a =0;
        int k = 0;
        while (n>1){
            a += n%10;
            n = n/10;
            k++;
        }
        System.out.println("raqamlari yig'indisi = "+a+" raqamari soni = "+k);
    }
}
