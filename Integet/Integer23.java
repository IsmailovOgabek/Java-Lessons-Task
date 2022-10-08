package com.company.Integet;

import java.util.Scanner;

public class Integer23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int soat = n/3600;
        int minut = n/60;
        int sekund = n%60;
        System.out.println(soat+"\n"+minut+"\n"+sekund);
    }
}
