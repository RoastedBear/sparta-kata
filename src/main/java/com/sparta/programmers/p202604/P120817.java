package com.sparta.programmers.p202604;

import java.util.Scanner;

public class P120817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double result = (double) sum / numbers.length;

        System.out.println(result);
    }
}