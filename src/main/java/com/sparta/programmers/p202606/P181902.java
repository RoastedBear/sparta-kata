package com.sparta.programmers.p202606;

import java.util.Arrays;
import java.util.Scanner;

public class P181902 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.next();

        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            char a = my_string.charAt(i);

            if (a >= 'A' && a <= 'Z') {
                answer[a - 'A']++;
            } else {
                answer[a - 'a' + 26]++;
            }
        }

        System.out.println(Arrays.toString(answer));
    }
}
