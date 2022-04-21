package com;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int ans = 0;
        int temp = n;

        for(int i = n ; i>=2 ; i--) {
            ans = 0;
            for (int j = 0; j < i-1; j++) {
                ans += temp;
            }
            temp = ans;
        }

        System.out.println(n + "! = " + ans);
    }
}
