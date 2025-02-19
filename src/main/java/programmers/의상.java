package programmers;

import java.util.HashMap;
import java.util.Map;

public class 의상 {
    public static void main(String[] args) {

        String[][] A = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(A));
    }
    public static int solution(String[][] clothes) {
        //[["yellow_hat", "headgear"]
        //["blue_sunglasses", "eyewear"]
        //["green_turban", "headgear"] ]
        //return = 5

        Map<String, Integer> map = new HashMap<>();
        int answer = 1;


        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }

        for (String key : map.keySet()) {
            answer *= (map.get(key) + 1);
        }

        answer -= 1;
        return answer;
    }
}
