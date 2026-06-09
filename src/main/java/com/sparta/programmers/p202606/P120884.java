package com.sparta.programmers.p202606;

import java.util.Scanner;

public class P120884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chicken = sc.nextInt();
        int answer = 0;
        int coupon = chicken;

        while (coupon >= 10) {
            int service = coupon / 10;
            answer += service;
            coupon = service + coupon % 10;
        }

        System.out.println(answer);
    }
}
