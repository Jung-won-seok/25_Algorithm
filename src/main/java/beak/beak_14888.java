package beak;

import java.util.Scanner;

public class beak_14888 {
    public static int N;
    public static int[] operator = new int[4]; // + - * /
    public static int[] number;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            operator[i] = sc.nextInt();
        }


    }

    public static void dfs(int depth, int num) {
        if (depth == N) {

        }
    }
}
