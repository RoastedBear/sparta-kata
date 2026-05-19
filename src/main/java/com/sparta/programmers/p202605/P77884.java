package com.sparta.programmers.p202605;

import java.util.Scanner;

public class P77884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int a = (int) Math.sqrt(i);

            if (a * a == i) {
                answer -= i;
            } else {
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
