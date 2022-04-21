package com;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();

        long ans = findBinary(a);
        System.out.println(ans);

    }

    public static long findBinary(int a) {
        if(a == 0)
            return 0;

        int rem = a % 2;

        return findBinary(a / 2) * 10 + rem;
    }
}
