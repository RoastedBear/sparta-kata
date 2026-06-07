package com.sparta.programmers.p202606;

import java.util.Arrays;
import java.util.Scanner;

public class P12932 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        String a = String.valueOf(n);
        int[] b = new int[a.length()];

        for (int i = 0; i < a.length(); i++) {
            b[i] = a.charAt(a.length() - 1 - i) - '0';
        }

        System.out.println(Arrays.toString(b));
    }
}
