package com.company.Switch;

import java.util.Scanner;

public class Case10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        switch (k){
            case 0:
                System.out.println("Haratni davom ettir");
            case 1:
                System.out.println("Chpga buril");
            case 2:
                System.out.println("O'ngga burul");
            default:
                System.out.println("Xato");
        }

    }
}
