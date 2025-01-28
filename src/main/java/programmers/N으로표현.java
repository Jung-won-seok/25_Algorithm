package programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class N으로표현 {
    //N=5, number=12, return=4
    //N=2, number=11, return=3

    public int solution(int N, int number) {

        List<Set<Integer>> box = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            Set<Integer> set = new HashSet<>();
            String nn = Integer.toString(N).repeat(i);
            set.add(Integer.parseInt(nn));
            box.add(set);
        }

        for (int i = 2; i <= 8; i++) {

        }

        int answer = 0;
        return answer;

    }
}
