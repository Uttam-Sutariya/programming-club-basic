package com;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        System.out.println("Enter divisor");
        int b = sc.nextInt();

        if(a == b){
            System.out.println("Quotient = " + 1);
            System.out.println("Reminder = " + 0);
        } else {
            int diff = a - b;
            int quotient = 0;
            int rem;

            while (diff >= b){
                quotient++;
                diff -= b;
            }

            rem = diff;

            System.out.println("Quotient = " + (quotient + 1));
            System.out.println("Reminder = " + rem);
        }

    }
}
