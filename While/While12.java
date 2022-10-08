package com.company.While;

import java.util.Scanner;

public class While12 {
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
        if (sum>n){
            k--;
            sum -= k;
            System.out.println("1 dan "+(k-1)+" gacha sonlarni yig'indisi "+sum+" -> "+n+" dan kichik");
        }else
        System.out.println("1 dan "+(k-1)+" gacha sonlarni yig'indisi "+sum+" -> "+n+" ga teng");

    }
}
