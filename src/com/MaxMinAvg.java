package com;

import java.util.Scanner;

public class MaxMinAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int avg = 0;
        int num;

        System.out.println("Enter " + n + " numbers");
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            if(num > max)
                max = num;
            if(num < min)
                min = num;
            avg += num;
        }

        avg /= n;

        System.out.println("Maximum = " + max);
        System.out.println("Minumun = " + min);
        System.out.println("Average = " + avg);
    }
}
