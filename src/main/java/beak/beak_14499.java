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

        //주사위 굴리기
        for (int i = 0; i < move.length; i++) {
            int[] newDice = new int[6];

            // 좌표 이동
            if (move[i] == 1 && y + 1 < M) {
                y++;
            } else if (move[i] == 2 && y - 1 >= 0) {
                y--;
            } else if (move[i] == 3 && x - 1 >= 0) {
                x--;
            } else if (move[i] == 4 && x + 1 < N) {
                x++;
            } else {
                continue;
            }

            switch (move[i]) {
                case 1: // 동쪽으로 굴림
                    newDice[0] = dice[3];
                    newDice[1] = dice[1];
                    newDice[2] = dice[0];
                    newDice[3] = dice[5];
                    newDice[4] = dice[4];
                    newDice[5] = dice[2];
                    break;

                case 2: // 서쪽으로 굴림
                    newDice[0] = dice[2];
                    newDice[1] = dice[1];
                    newDice[2] = dice[5];
                    newDice[3] = dice[0];
                    newDice[4] = dice[4];
                    newDice[5] = dice[3];
                    break;

                case 3: // 북쪽으로 굴림
                    newDice[0] = dice[4];
                    newDice[1] = dice[0];
                    newDice[2] = dice[2];
                    newDice[3] = dice[3];
                    newDice[4] = dice[5];
                    newDice[5] = dice[1];
                    break;

                case 4: // 남쪽으로 굴림
                    newDice[0] = dice[1];
                    newDice[1] = dice[5];
                    newDice[2] = dice[2];
                    newDice[3] = dice[3];
                    newDice[4] = dice[0];
                    newDice[5] = dice[4];
                    break;
            }

            // 주사위 상태 업데이트
            dice = newDice;

            // 바닥 숫자 복사 및 출력
            if (cordinate[x][y] == 0) {
                cordinate[x][y] = dice[5];
            } else {
                dice[5] = cordinate[x][y];
                cordinate[x][y] = 0;
            }

            // 윗면 숫자 출력
            System.out.println(dice[0]);
        }
    }
}