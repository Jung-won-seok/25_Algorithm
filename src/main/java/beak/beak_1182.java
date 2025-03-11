package beak;

import java.util.Scanner;

public class beak_1182 {
    static int[] num;
    private static int N;
    private static int S;
    private static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); //N=5
        S = sc.nextInt(); //S=0
        num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt(); //-7, -3, -2, 5, 8
        }

        dfs(0, 0);
        if (S == 0) {
            System.out.println(answer - 1);
        } else {
            System.out.println(answer);
        }
    }

    private static void dfs(int depth, int sum) {
        if (depth == N) {
            if (sum == S) answer++;
            return;
        }
        dfs(depth + 1, sum + num[depth]);
        dfs(depth + 1, sum);
    }
}