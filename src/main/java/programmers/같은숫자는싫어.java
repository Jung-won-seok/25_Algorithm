package programmers;

import java.util.Stack;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {
        //ex) [1,1,3,3,0,1,1] -> [1,3,0,1]
        //ex) [4,4,4,3,3] -> [4,3]

        Stack<Integer> list = new Stack<>();
        list.add(arr[0]);

        for(int i=1 ; i<arr.length ; i++) {
            if (arr[i] != arr[i-1]) {
                list.add(arr[i]);
            }
        }

        //ArrayList를 배열로 변환
        return list.stream().mapToInt(i -> i).toArray();
    }
}