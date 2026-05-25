package com.sparta.programmers.p202605;

import java.util.Scanner;

public class P12935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        System.out.println(answer);
    }
    /*
    문제 설명

    정수 n을 입력받아 n의 약수를 모두 더한 값을 return 하는 문제입니다.

    약수란 어떤 수를 나누었을 때 나머지가 0이 되는 수를 의미합니다.

    예를 들어,
    12의 약수는 1, 2, 3, 4, 6, 12입니다.
    이를 모두 더하면 28이므로 28을 return 합니다.

    5의 약수는 1, 5입니다.
    이를 모두 더하면 6이므로 6을 return 합니다.

    제한 사항

    1. n은 0 이상 3000 이하인 정수입니다.

    입출력 예

    n       return
    12      28
    5       6
*/
}
