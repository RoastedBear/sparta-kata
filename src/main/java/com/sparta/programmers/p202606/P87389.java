package com.sparta.programmers.p202606;

import java.util.Scanner;

public class P87389 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x = 2; x < n; x++) {
            if (n % x == 1) {
                System.out.println(x);
            }
        }
        System.out.println(n-1);
    }
}
