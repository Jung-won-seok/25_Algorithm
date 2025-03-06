package beak;

import java.util.Scanner;

public class beak_14501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int[][] day = new int[N][2];
        for (int i = 0; i < N; i++) {
            day[i][0] = sc.nextInt();
            day[i][1] = sc.nextInt();
        }

        int[] dp = new int[N + 1];
        for (int i = 0; i < N; i++) {
            int nextDay = i + day[i][0];
            if (nextDay <= N) {
                dp[nextDay] = Math.max(dp[nextDay], dp[i] + day[i][1]);
            }
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);
        }
        System.out.println(dp[N]);
    }
}