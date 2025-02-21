package programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {
    public static void main(String[] args) {
        int[] p = {93, 33, 55};
        int[] s = {1, 30, 5};
        int[] solution = solution(p, s);
        for (int a : solution) {
            System.out.println(a);
        }
    }
    public static int[] solution(int[] progresses, int[] speeds) {
        //progresses = [93, 33, 55], speeds = [1, 30, 5], return = [2, 1]
        //progresses = [95, 90, 99, 99, 80, 99], speeds = [1, 1, 1, 1, 1, 1], return = [1, 3, 2]

        //7, 3, 9 ->
        //5, 10, 1, 1, 20, 1 ->
        int[] duration = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            int a = 100 - progresses[i]; //45
            if (a % speeds[i] == 0) {
                duration[i] = a / speeds[i];
            } else {
                duration[i] = a / speeds[i] + 1;
            }
        }

        ArrayList<Integer> resultList = new ArrayList<>();
        int i = 0;
        while (i < duration.length) {
            int start = duration[i];
            int count = 1;
            int j = i + 1;
            while (j < duration.length && duration[j] <= start) {
                count++;
                j++;
            }
            resultList.add(count);
            i = j;
        }
        // ArrayList를 int[]로 변환
        int[] result = new int[resultList.size()];
        for (int k = 0; k < result.length; k++) {
            result[k] = resultList.get(k);
        }
        return result;
    }
}
