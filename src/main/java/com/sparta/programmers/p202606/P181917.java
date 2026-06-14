package com.sparta.programmers.p202606;

import java.util.Scanner;

public class P181917 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean x1 = sc.nextBoolean();
        boolean x2 = sc.nextBoolean();
        boolean x3 = sc.nextBoolean();
        boolean x4 = sc.nextBoolean();

        boolean result = (x1 || x2) && (x3 || x4);

        System.out.println(result);
    }
}
/*
boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때,
다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.

(x1 ∨ x2) ∧ (x3 ∨ x4)

∨ : OR 연산자, Java에서는 ||
∧ : AND 연산자, Java에서는 &&
*/