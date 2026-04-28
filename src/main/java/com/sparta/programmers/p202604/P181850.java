package com.sparta.programmers.p202604;

public class P181850 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(1.42));
        System.out.println(sol.solution(69.32));
    }
}

class Solution {
    public int solution(double flo) {
        return (int) flo;
    }
}
