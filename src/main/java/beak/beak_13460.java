package beak;

import java.util.Scanner;

public class beak_13460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
                if (line.charAt(j) == 'R') {
                    int r_height = i;
                    int r_weight = j;
                }
                if (line.charAt(j) == 'B') {
                    int b_height = i;
                    int b_weight = j;
                }
                if (line.charAt(j) == 'O') {
                    int o_height = i;
                    int o_weight = j;
                }
            }
        }



        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    //왼쪽으로 기울이기
    public void left() {

    }

    //오른쪽으로 기울이기
    public void right() {

    }

    //위로 기울이기
    public void up() {

    }

    //아래로 기울이기
    public void down() {

    }
}