package beak;

import java.util.Scanner;

public class beak_14500 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //세로
        int M = sc.nextInt(); //가로
        int[][] board = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M-3; j++) {
                int first = board[i][j] + board[i][j + 1] + board[i][j + 2] + board[i][j + 3];
                if (first > max) {
                    max = first;
                }
            }
        }

        for (int i = 0; i < N - 3; i++) {
            for (int j = 0; j < M; j++) {
                int first_low = board[i][j] + board[i+1][j] + board[i+2][j] + board[i+3][j];
                if (first_low > max) {
                    max = first_low;
                }
            }
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < M - 1; j++) {
                int second = board[i][j] + board[i+1][j] + board[i][j+1] + board[i+1][j+1];
                if (second > max) {
                    max = second;
                }
            }
        }

        for (int i = 0; i < N-2 ; i++) {// 0~2
            for (int j = 0; j < M - 1; j++) {// 0~3
                int thrid = board[i][j] + board[i+1][j] + board[i+2][j] + board[i+2][j+1];
                if (thrid > max) {
                    max = thrid;
                }
            }
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < M - 2; j++) {
                int third_2 = board[i][j] + board[i][j+1] + board[i][j+2] + board[i+1][j+2];
                if (third_2 > max) {
                    max = third_2;
                }
            }
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < M - 2; j++) {
                int thrid_3 = board[i][j] + board[i+1][j] + board[i][j+1] + board[i][j+2];
                if (thrid_3 > max) {
                    max = thrid_3;
                }
            }
        }



    }
}
