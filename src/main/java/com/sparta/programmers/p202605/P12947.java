package com.sparta.programmers.p202605;

import java.util.Scanner;

public class P12947 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = x;
        int b = 0;
        while (x > 0) {
            b += x % 10;
            x /= 10;
        }
        boolean c = a % b == 0;
        System.out.println(c);
    }
}