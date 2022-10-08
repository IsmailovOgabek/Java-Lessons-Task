package com.company.IF;

import java.util.Scanner;

public class If5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int musbat = 0;
        int manfiy = 0;
        if (a>0){
            musbat++;
        }else{
            manfiy++;
        }
        if (b>0){
            musbat++;
        }else{
            manfiy++;
        }
        if (c>0){
            musbat++;
        }else{
            manfiy++;
        }
        System.out.println(musbat + " ta musbat");
        System.out.println(manfiy + " ta manfiy");
    }
}
