package com.sparta.d_2026_02_23;

public class P047 {
    public int solution(int n) {
        String a = "";
        while (n > 0) {
            a += (n % 3);
            n /= 3;
        }
        int answer = 0;
        int b = 1;
        for (int i = a.length() - 1; i >= 0; i--) {
            answer += (a.charAt(i) - '0') * b;
            b *= 3;
        }
        return answer;
    }
}
