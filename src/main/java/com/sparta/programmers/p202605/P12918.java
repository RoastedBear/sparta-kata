package com.sparta.programmers.p202605;

public class P12918 {
    class Solution {
        public boolean solution(String s) {
            if (s.length() != 4 && s.length() != 6) {
                return false;
            }
            for (int i = 0; i < s.length(); i++) {
                char a = s.charAt(i);
                if (a < '0' || a > '9') {
                    return false;
                }
            }
            return true;
        }
    }
}
