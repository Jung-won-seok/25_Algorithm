package programmers;

public class 체육복 {
    //n=5
    //lost=[2, 4]
    //reserve=[3]
    //return 4

    public int solution(int n, int[] lost, int[] reserve) {

        int[] student = new int[n];
        for (int i = 1; i <= n; i++) {
            student[i - 1] = 1;
        }

        for (int i = 0; i < reserve.length; i++) {
            student[reserve[i]-1]++;
        }

        for (int i = 0; i < lost.length; i++) {
            student[lost[i]-1]--;
        }

        for (int i = 0; i < n; i++) {
            if (student[i] == 0) {
                if (i >= 1 || i < n - 1) {
                    if (student[i - 1] == 2 || student[i + 1] == 2) {

                    }
                }

            }
        }

        int answer = 0;
        return answer;
    }
}