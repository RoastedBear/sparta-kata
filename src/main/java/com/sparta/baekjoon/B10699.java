package com.sparta.baekjoon;

import java.time.LocalDate;
import java.time.ZoneId;


public class B10699 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now(ZoneId.of("Asia/Seoul"));
        System.out.println(now);
    }
}
