package programmers;

import java.util.Arrays;

public class K번째수_2 {

    //array[] = [1, 5, 2, 6, 3, 7, 4]
    //commands[][] = [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
    //return [5, 6, 3]

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            // 부분 배열 복사
            int[] subArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            // 정렬
            Arrays.sort(subArray);
            // K번째 수 선택
            answer[i] = subArray[commands[i][2] - 1];
        }
        return answer;
    }
}
