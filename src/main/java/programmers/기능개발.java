package programmers;

public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
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

        int cnt = 0;
        for (int i = 0; i < duration.length; i++) {
            if (duration[i] > duration[i + 1]) {
                cnt++;
            }
        }

        int[] answer = new int[cnt];
        int x = duration[0];
        int c = 1;
        int num = 0;
        for (int i = 1; i < duration.length; i++) {
            if (x > duration[i]) {
                c++;
            } else {
                answer[num] = c;
                c = 1;
                num++;
            }
        }
        return answer;
    }
}
