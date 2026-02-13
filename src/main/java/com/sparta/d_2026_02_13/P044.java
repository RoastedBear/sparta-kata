package com.sparta.d_2026_02_13;

public class P044 {
    public int solution(int[][] sizes) {
        int bigw = 0;
        int bigh = 0;
        int answer = 0;
        for(int i = 0; i < sizes.length;i++){
            int width = sizes[i][0];
            int height = sizes[i][1];

            int num1, num2;

            if(width > height){
                num1 = width;
                num2 = height;
            } else {
                num1 = height;
                num2 = width;
            }

            if (num1 > bigw){
                bigw = num1;
            }
            if (num2 > bigh){
                bigh = num2;
            }
        }
        answer = bigh*bigw;
        return answer;
    }
}
