package com.sparta.programmers.p202606;

import java.util.Scanner;

public class P80601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];

        int answer = 45;

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            answer -= numbers[i];
        }

        System.out.println(answer);
    }

}
