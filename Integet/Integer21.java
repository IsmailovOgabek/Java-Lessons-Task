package com.company.Integet;

import java.util.Scanner;

public class Integer21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = n/60;
        int s = n%60;
        System.out.println("Kun boshidan beri "+m+" minut"+s+" sekund o'tdi");
    }
}
