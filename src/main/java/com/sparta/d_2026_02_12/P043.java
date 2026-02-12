package com.sparta.d_2026_02_12;

public class P043 {
        public int solution(String t, String p) {
            int tl = t.length()-p.length()+1;
            int answer = 0;
            for(int i = 0; i < tl; i++ ){
                String t1 = t.substring(i, i+p.length());
                if(Long.parseLong(t1) <= Long.parseLong(p)){
                    answer++;
                }
            }
            return answer;
        }
}
