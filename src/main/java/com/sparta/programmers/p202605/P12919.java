package com.sparta.programmers.p202605;

public class P12919 {
    public static void main(String[] args) {
        class Solution {
            public String solution(String[] seoul) {
                int index = 0;

                for (int i = 0; i < seoul.length; i++) {
                    if (seoul[i].equals("Kim")) {
                        index = i;
                        break;
                    }
                }
                return "김서방은 " + index + "에 있다";
            }
        }
    }
}
