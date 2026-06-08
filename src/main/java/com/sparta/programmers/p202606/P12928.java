package com.sparta.programmers.p202606;

import java.util.Scanner;

public class P12928 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                n += i;
            }
        }

        System.out.println(n);
    }
}
