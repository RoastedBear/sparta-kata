package com.sparta.d_2026_02_10;

public class P041 {
    public String solution(String s) {
        int j,k = 0;
        StringBuilder sb = new StringBuilder();
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                j = 0;
                sb.append(" ");
            } else {
                j++;
                if (j > 0 && j % 2 != 0) {
                    sb.append(Character.toUpperCase(s.charAt(i)));
                } else {
                    sb.append(Character.toLowerCase(s.charAt(i)));
                }
            }
        }
        answer = sb.toString();
        return answer;
    }
}
