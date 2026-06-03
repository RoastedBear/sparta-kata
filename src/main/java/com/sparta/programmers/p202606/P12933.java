package com.sparta.programmers.p202606;

import java.util.Arrays;
import java.util.Scanner;

public class P12933 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String x = String.valueOf(n);
        char[] a = x.toCharArray();
        Arrays.sort(a);
        StringBuilder sb = new StringBuilder(new String(a));
        long result = Long.parseLong(sb.reverse().toString());
        System.out.println(result);
    }
}
