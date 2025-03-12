package beak;

import java.util.HashSet;
import java.util.Scanner;

public class beak_14225 {
    static int[] S;
    private static int N;
    static HashSet<Integer> set = new HashSet<>();

    public static void main(String[] args) {
        //수열 S의 부분 수열의 합으로 나올 수 없는 가장 작은 자연수는?
        //S={5, 1, 2}인 경우 1, 2, 3, 5, 6, 7, 8을 만들 수 있지만 4를 만들 순 없다. -> 정답 = 4
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt();
        }
        dfs(0, 0);

        int i = 1;
        while (set.contains(i)) {
            i++;
        }
        System.out.println(i);
    }

    private static void dfs(int depth, int sum) {
        if (depth == N) {
            if (sum > 0) {
                set.add(sum);
            }
            return;
        }

        dfs(depth + 1, sum + S[depth]);
        dfs(depth + 1, sum);
    }
}