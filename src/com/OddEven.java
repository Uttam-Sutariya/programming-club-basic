package com;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();

        if((a & 1) == 1)
            System.out.println("Number is odd");
        else
            System.out.println("Number is even");
    }
}
