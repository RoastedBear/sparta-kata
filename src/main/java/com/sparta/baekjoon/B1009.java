package com.sparta.baekjoon;

import java.util.Scanner;

public class B1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        while (a-- > 0) {
            int b = sc.nextInt();
            int c = sc.nextInt();

            int result = 1;

            for (int i = 0; i < c; i++) {
                result = (result * b) % 10;
            }

            if (result == 0) result = 10;

            System.out.println(result);
        }
    }
}
