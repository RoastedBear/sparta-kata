package com.sparta.programmers.p202606;

import java.util.Scanner;

public class P134240 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] food = new int[n];
        for (int i = 0; i < n; i++) {
            food[i] = sc.nextInt();
        }

        StringBuilder left = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;

            for (int j = 0; j < count; j++) {
                left.append(i);
            }
        }
        String result = left.toString() + "0" + left.reverse().toString();
        System.out.println(result);
    }

}