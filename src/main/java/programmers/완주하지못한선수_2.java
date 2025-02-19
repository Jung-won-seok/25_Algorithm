package programmers;

import java.util.HashMap;

public class 완주하지못한선수_2 {
    class Solution{
        public String solution(String[] participant, String[] completion) {
            String answer = "";

            HashMap<String, Integer> map = new HashMap<>();

            //getOrDefault 메서드 -> 해시맵에 존재하는 이름이면 값을 증가, 존재하지 않으면 0을 기본값 설정 후 1 증가
            for (int i = 0; i < participant.length; i++) {
                map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
            }

            //완주자의 이름의 값을 해시맵에서 감소
            for (String c : completion) {
                map.put(c, map.get(c) - 1);
            }

            //0이 아닌 참가자 이름을 찾는다
            for (String key : map.keySet()) {
                if (map.get(key) != 0) {
                    return key;
                }
            }
            return answer;
        }
    }
}
