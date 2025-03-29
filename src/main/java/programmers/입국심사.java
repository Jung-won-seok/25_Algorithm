package programmers;

import java.util.*;

public class 입국심사 {
    public long solution(int n, int[] times) {
        //n=6
        //times[] = [7, 10]
        //return = 28

        Arrays.sort(times);
        long min = 1;

        //최고로 오래 걸리는 경우의 수
        long max = (long) times[times.length - 1] * n;
        long mid = 0;
        long sum;
        long answer = max;

        while (min <= max) {
            sum = 0;
            mid = (min + max) / 2;

            for (int i = 0; i < times.length; i++) {
                sum = sum + mid / times[i];
            }

            if (sum >= n) {
                answer = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return answer;

    }
}