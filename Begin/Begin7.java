package com.company.Begin;

import java.util.Scanner;

public class Begin7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Doiranign radiusini kiriting = ");
        double R = in.nextInt();
        double L = 2*Math.PI;
        double S = Math.PI*R*R;
        System.out.println("Doiraning uzunligi = "+L+"\nDoiraning yuzi = "+S);
    }
}
