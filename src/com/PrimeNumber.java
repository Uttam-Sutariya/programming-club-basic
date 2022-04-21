package com;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int i = a;

        System.out.println("Prime numbers between " + a + " and " + b);

        do {
            if(isPrime(i))
                System.out.println(i);
            i++;
        } while (i <= b);
    }

    public static boolean isPrime(int n) {
        for(int i = 2 ; i<=Math.sqrt(n) ; i++) {
            if(n % i == 0)
                return false;
        }

        return true;
    }
}
