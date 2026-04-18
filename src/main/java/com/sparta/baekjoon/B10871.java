package com.sparta.baekjoon;

import java.util.Scanner;

public class B10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i =0;i<a; i++){
            int c = sc.nextInt();
            if(c<b){
                System.out.println(c+" ");
            }
        }
    }
}
