package beak;

import java.util.Scanner;

public class beak_15658 {
    public static int N;
    public static int[] number;
    public static int[] operator = new int[4]; //더하기 빼기 곱하기 나누기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        number = new int[N];

        for (int i = 0; i < N; i++) {
            number[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            operator[i] = sc.nextInt();
        }

        dfs(0, 1);
    }

    public static void dfs(int num, int idx) {
        if (idx == N) {

        }
        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) {
                operator[i]--;

                switch (i) {

                    case 0: dfs(num + number[idx], idx + 1); break;
                    case 1: dfs(num - number[idx], idx + 1); break;
                    case 2: dfs(num * number[idx], idx + 1); break;
                    case 3: dfs(num / number[idx], idx + 1); break;
                }

                operator[i]++;
            }
        }
    }
}