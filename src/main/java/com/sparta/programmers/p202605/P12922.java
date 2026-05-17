package com.sparta.programmers.p202605;

import java.util.Scanner;

public class P12922 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String answer = "";
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                answer += "수";
            } else {
                answer += "박";
            }
        }
        System.out.println(answer);
    }
}
