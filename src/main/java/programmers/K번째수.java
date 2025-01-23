package programmers;

import java.util.Arrays;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        //array[] = [1, 5, 2, 6, 3, 7, 4]
        //commands[][] = [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
        //return [5, 6, 3]

        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int n = commands[i][1] - commands[i][0] + 1;
            int[] arr = new int[n];
            int s = 0;
            for (int j = commands[i][0]; j <= commands[i][1]; j++) {
                arr[s] = array[j-1];
                s++;
            }
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2] - 1];
        }
        return answer;
    }
}