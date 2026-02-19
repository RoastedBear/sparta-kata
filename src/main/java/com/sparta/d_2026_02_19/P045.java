package com.sparta.d_2026_02_19;

public class P045 {
    public String solution(String s, int n) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                result += " ";
            } else if (c >= 'A' && c <= 'Z') {
                char changed = (char)(c + n);
                if (changed > 'Z') changed -= 26;
                result += changed;
            } else {
                char changed = (char)(c + n);
                if (changed > 'z') changed -= 26;
                result += changed;
            }
        }

        return result;
    }

}
