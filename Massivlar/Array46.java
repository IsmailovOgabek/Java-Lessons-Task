package com.company.Massivlar;

import java.util.Scanner;
// n ta elementdan tashkil topgan massiv va R butun son berilgan Massiv elementlari orasidan R soniga yig'indisi eng yaqin
// 2 ta elementni chaqiruvchi progroma tuzilsiz.
public class Array46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int sum = 0, engYaqin = 0, index1 = 0, index2 = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {

            for (int j = i+1; j < n; j++) {
                sum = a[i] + a[j];
                engYaqin = Math.abs(r - sum);
                if (min>engYaqin){
                    min = engYaqin;
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println(index1+"\t"+index2);
    }
}
