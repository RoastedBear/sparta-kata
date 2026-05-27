package com.sparta.programmers.p202605;

import java.util.Scanner;

public class P12937 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }

}
