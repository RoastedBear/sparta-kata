package com.sparta.programmers.p202605;

import java.util.Scanner;

public class P86051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int answer = 45;

        for (int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }

        System.out.println(answer);
    }
    /*
     * 프로그래머스 86051번 - 없는 숫자 더하기
     *
     * 문제 설명
     * 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 주어진다.
     * numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 해야 한다.
     *
     * 제한사항
     * - 1 <= numbers의 길이 <= 9
     * - 0 <= numbers의 모든 원소 <= 9
     * - numbers의 모든 원소는 서로 다르다.
     *
     * 풀이 아이디어
     * 0부터 9까지의 합은 45이다.
     * 따라서 45에서 numbers에 들어있는 숫자들을 모두 빼면,
     * numbers에 없는 숫자들의 합만 남는다.
     *
     * 입력 예시
     * 8
     * 1 2 3 4 6 7 8 0
     *
     * 출력 예시
     * 14
     */
}
