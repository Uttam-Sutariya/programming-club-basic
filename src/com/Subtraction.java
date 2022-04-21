package com;

import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = a + (~b) + 1;

        System.out.println("A - b = " + a + " - " + b + " = " + ans);
    }
}
