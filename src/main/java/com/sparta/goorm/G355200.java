package com.sparta.goorm;

import java.util.Scanner;

public class G355200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long am = sc.nextLong();
        long bm = sc.nextLong();
        long cm = sc.nextLong();

        long a = am * bm;
        long b = cm;

        long x = a;
        long y = b;

        while (y != 0) {
            long c = x % y;
            x = y;
            y = c;
        }

        System.out.println((a / x) + " " + (b / x));
    }
}
