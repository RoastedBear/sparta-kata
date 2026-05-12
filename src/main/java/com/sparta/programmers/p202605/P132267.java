package com.sparta.programmers.p202605;

import java.util.Scanner;

public class P132267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int answer = 0;
        while(n/a!=0){
            answer = answer+n/a*b;
            n=n/a*b+n%a;
        }
        System.out.println(answer);
    }
}
