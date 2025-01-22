package programmers;

import java.util.PriorityQueue;

public class 더맵게 {
    public int solution(int[] scoville, int K) {
        //scoville[] = [1, 2, 3, 9, 10, 12] -> k=7 -> return=2

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int n : scoville) {
            queue.add(n);
        }

        int answer = 0;

        while (queue.size() > 1) {
            //최소값이 k 이상이면 종료
            if (queue.peek() >= K) {
                return answer;
            }

            int first = queue.poll();
            int second = queue.poll();
            int newScoville = first + second * 2;
            queue.add(newScoville);

            answer++;
        }

        if (queue.peek() >= K) {
            return answer;
        } else {
            return -1;
        }
    }
}