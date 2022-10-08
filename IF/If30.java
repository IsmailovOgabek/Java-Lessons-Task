package com.company.IF;

import java.util.Scanner;

public class If30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a>0 && a<10 && a%2==0){
            System.out.println(a+" bir xonali juft son");

        }else if (a>0 && a<10 && a%2==1){
            System.out.println(a+" bir xonali toq son");

        }else if (a>=10 && a<100 && a%2==1){
            System.out.println(a+" ikki xonali toq son");

        }else if (a>=10 && a<100 && a%2==0) {
            System.out.println(a + " ikki xonali juft son");

        }else if (a>=100 && a<1000 && a%2==1) {
            System.out.println(a + " uch xonali toq son");

        }else if (a>=10 && a<1000 && a%2==0) {
            System.out.println(a + " uch xonali juft son");
        }
    }
}
