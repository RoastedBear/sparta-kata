package com.sparta.others;

public class P022 {
    public long solution(int a, int b) {
        int x = Math.min(a, b);
        int y = Math.max(a, b);
        long z = 0;
        for (int i = x; i <= y; i++) {
            z += i;
        }
        return z;
    }
}
