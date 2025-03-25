package beak;

import java.util.Scanner;

public class beak_14500 {

    static boolean[][] visited;
    static int answer = 0;
    static int[][] board;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //세로
        int M = sc.nextInt(); //가로
        board = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                board[i][j] = sc.nextInt();
            }
        }



        static void dfs()


    }
}