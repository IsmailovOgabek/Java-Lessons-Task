package com.company.IF;

import java.util.Scanner;

public class If28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int yil = in.nextInt();

        if (yil%4==0 && (yil%100!=0 || yil%400==0)){

            System.out.println("Kabisa yili 366 kun");

        }else {
            System.out.println("Kabisa yili emas 365 kun");
        }
    }
}
