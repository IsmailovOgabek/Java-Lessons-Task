package com.company.While;

import java.util.Scanner;

public class While14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a>1 a = ");
        double a = in.nextDouble();
        double k = 1;
        double sum = 0;
        while (sum<a){
            sum += 1/k;
            k++;
        }
        if (sum>a){
            k--;
            sum -= 1/k;
            System.out.println("1 dan "+(k-1)+" gacha sonlarni yig'indisi "+sum+" -> "+a+" dan kichik");
        }else
            System.out.println("1 dan "+(k-1)+" gacha sonlarni yig'indisi "+sum+" -> "+a+" ga teng");

    }
}
