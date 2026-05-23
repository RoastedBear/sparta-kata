package com.sparta.programmers.p202605;

import java.util.Scanner;

public class P12948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phone_number = sc.next();
        String answer = "";
        for (int i = 0; i < phone_number.length(); i++) {
            if (i < phone_number.length() - 4) {
                answer += "*";
            } else {
                answer += phone_number.charAt(i);
            }
        }
        System.out.println(answer);
    }
}
