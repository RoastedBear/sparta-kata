package com.sparta.programmers.p202605;

import java.util.Scanner;

public class P12943 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 0;
        while (n != 1){
            if(count == 500) {
                System.out.println(-1);
                return;
            }
            if(n % 2 == 0){
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            count++;
        }
        System.out.println(count);
    }

}
