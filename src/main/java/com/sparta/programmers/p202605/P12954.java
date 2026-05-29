package com.sparta.programmers.p202605;

import java.util.Arrays;
import java.util.Scanner;

public class P12954 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }
        System.out.println(Arrays.toString(answer));
    }

}
