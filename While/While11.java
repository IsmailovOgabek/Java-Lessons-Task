package com.company.While;

import java.util.Scanner;

public class While11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        int k = 1;
        int sum = 0;
        while (sum<n){
            sum += k;
            k++;
        }
        System.out.println("1 dan "+(k-1)+" gacha sonlarni yig'indisi "+sum+" -> "+n+" dan katta");
    }

}
