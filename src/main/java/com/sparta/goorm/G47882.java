package com.sparta.goorm;

import java.util.Scanner;

public class G47882 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '1') {
                a++;
            } else if (ch == 'I') {
                b++;
            } else if (ch == 'l') {
                c++;
            } else if (ch == '|') {
                d++;
            }
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
