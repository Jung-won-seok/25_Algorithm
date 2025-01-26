package programmers;

public class 체육복 {
    //n=5
    //lost=[2, 4]
    //reserve=[3]
    //return 4

    public int solution(int n, int[] lost, int[] reserve) {

        int[] student = new int[n];
        for (int i = 0; i < n; i++) {
            student[i] = 1;
        }

        //여벌 체육복이 있는 학생 = 2
        for (int i = 0; i < reserve.length; i++) {
            student[reserve[i]-1]++;
        }

        //체육복을 잃어버린 학생 = 0
        for (int i = 0; i < lost.length; i++) {
            student[lost[i]-1]--;
        }

        //체육복 빌려주기
        //[1, 0, 2, 0, 1]
        for (int i = 0; i < n; i++) {
            if (student[i] == 0) {
                if (i>0 && student[i - 1] == 2) {
                    student[i] = 1;
                    student[i - 1] = 1;
                } else if (i<n-1 && student[i + 1] == 2) {
                    student[i+1] = 1;
                    student[i] = 1;
                }

            }
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (student[i] >= 1) {
                answer++;
            }
        }

        return answer;
    }
}