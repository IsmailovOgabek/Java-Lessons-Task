package com.company.While;

import java.util.Scanner;

public class While23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int k = 2, s = 0;
        if (a>b){
            k = a;
        }else {
            k = b;
        }
        while (k>1){
            if (a%k==0 && b%k==0){
                System.out.println(a+" va "+b+" sonlarining eng katta bo'luvchisi "+k);
                break;
            }
            k--;
        }
    }
}
