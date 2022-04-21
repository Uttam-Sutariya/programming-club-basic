package com;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;

        for (int i = 0; i < b-1; i++) {
            for (int j = 0; j < a; j++) {
                ans += a;
            }
        }

        System.out.println(a + "^" + b + " = " + ans);
    }
}
