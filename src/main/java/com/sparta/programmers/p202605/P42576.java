package com.sparta.programmers.p202605;

import java.util.ArrayList;
import java.util.HashMap;

public class P42576 {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            String name = participant[i];
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        for (int i = 0; i < completion.length; i++) {
            String name = completion[i];
            map.put(name, map.get(name) - 1);
        }
        ArrayList<String> keys = new ArrayList<>(map.keySet());
        for (int i = 0; i < keys.size(); i++) {
            String name = keys.get(i);

            if (map.get(name) == 1) {
                return name;
            }
        }
        return "";
    }
}
