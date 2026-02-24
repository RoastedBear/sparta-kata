package com.sparta.d_2026_02_24;

public class P039 {
    public int[] solution(int n, int m) {
        int a = n;
        int b = m;

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        int gcd = a;
        int lcm = (n * m) / gcd;

        int[] answer = new int[]{gcd, lcm};
        return answer;
    }
}
