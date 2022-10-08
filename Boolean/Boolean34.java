package com.company.Boolean;

import java.util.Scanner;

public class Boolean34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("x va y 1-8 orasidagi butun sonlar");
        int x = in.nextInt();
        int y = in.nextInt();
        boolean natija = ((x+y)%2==1);
        System.out.println("Natiaj turu bo'lsa yacheykaoq = "+natija);

    }
}
