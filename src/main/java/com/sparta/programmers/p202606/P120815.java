package com.sparta.programmers.p202606;

import java.util.Scanner;

public class P120815 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int answer = 1;

        while ((answer * 6) % n != 0) {
            answer++;
        }

        System.out.println(answer);
    }
}
