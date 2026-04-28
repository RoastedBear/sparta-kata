package com.sparta.baekjoon;

import java.util.Scanner;

public class B9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < a; i++) {
            String str = sc.nextLine();
            System.out.println("" + str.charAt(0) + str.charAt(str.length() - 1));
        }
    }
}