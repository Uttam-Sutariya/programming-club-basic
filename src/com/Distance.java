package com;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        String strA = Integer.toBinaryString(a);
        String strB = Integer.toBinaryString(b);

        int distance = 0;

        for (int i = 0; i < Math.min(strA.length() , strB.length()); i++) {
            if(strA.charAt(strA.length() - i - 1) != strB.charAt(strB.length() - i - 1))
                ++distance;
        }
        distance += Math.abs(strA.length() - strB.length());

        System.out.println("Distance between " + strA + " and " + strB + " = " + distance);
    }
}
