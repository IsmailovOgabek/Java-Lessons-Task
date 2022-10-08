package com.company.While;

import java.util.Scanner;

public class While25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f1 = 1, f2 = 1, f = 0, k = 1, count = 0;
        while (k<=n){
            f = f1+f2;
            f1 = f2;
            f2 = f;
            if (f2>=n){
                System.out.printf("%d soni %d dan katta bo'lgan eng kichik fibonachchi son", f2, n);
                break;
            }
            k++;
        }


    }
}
