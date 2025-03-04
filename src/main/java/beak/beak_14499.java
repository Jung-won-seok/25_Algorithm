package beak;

import java.util.Scanner;

public class beak_14499 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int K = sc.nextInt();

        int[][] cordinate = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                cordinate[i][j] = sc.nextInt();
                cordinate[i][j] = sc.nextInt();
            }
        }

        int[] move = new int[K];
        for (int i = 0; i < K; i++) {
            move[i] = sc.nextInt();  //move[] = {4 4 4 1 3 3 3 2}
        }


        int[] dice = new int[6];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = 0;
        }



    }
}