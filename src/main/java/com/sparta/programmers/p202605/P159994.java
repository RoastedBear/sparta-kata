package com.sparta.programmers.p202605;

import java.util.Scanner;

public class P159994 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        String answer = "Yes";

        int a = 0;
        int b = 0;

        for (int i = 0; i < goal.length; i++) {
            if (a < cards1.length && cards1[a].equals(goal[i])) {
                a++;
            } else if (b < cards2.length && cards2[b].equals(goal[i])) {
                b++;
            } else {
                answer = "No";
                break;
            }
        }

        System.out.println(answer);
    }
}