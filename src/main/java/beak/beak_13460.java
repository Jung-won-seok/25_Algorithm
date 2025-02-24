package beak;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class beak_13460 {
    static int N, M; //보드 행, 열
    static char[][] board;
    static boolean[][][][] visited; //방문여부 [빨간행][빨간열][파란행][파란열]
    static int holeR, holeC; //구멍의 위치

    static class Position {
        int rR, rC, bR, bC, move;

        public Position(int rR, int rC, int bR, int bC, int move) {
            this.rR = rR;
            this.rC = rC;
            this.bR = bR;
            this.bC = bC;
            this.move = move;
        }
    }

    /**
     * 한 구슬을 주어진 방향(dx, dy)로 이동시키는 메서드
     * 벽에 부딪히거나 구멍에 빠질 때까지 계속 이동
     * @param r : 시작행
     * @param c : 시작열
     * @param dx : 행 이동 방향
     * @param dy : 열 이동 방향
     * @return {최종 행, 최종 열, 이동한 칸 수} 배열 변환
     */
    static int[] moveMarble(int r, int c, int dx, int dy) {
        int count = 0;
        while (board[r + dx][c + dy] != '#' && board[r][c] != 'O') {
            r += dx;
            c += dy;
            count++;
            if (board[r][c] == 'O') {
                break;
            }
        }
        return new int[]{r, c, count};
    }

    /**
     * BFS를 이용하여 최소 이동 횟수를 찾는 메서드
     * 빨간 구슬은 구멍에 넣되 파란 구슬이 구멍에 들어가면 안되는 경우만 탐색
     * 이동 횟수는 10번 이하로 제한
     * @param rR : 빨간 구슬 시작 행
     * @param rC : 빨간 구슬 시작 열
     * @param bR : 파란 구슬 시작 행
     * @param bC : 파란 구슬 시작 열
     * @return : 최소 이동 횟수, 불가능하면 -1 반환
     */
    public static int bfs(int rR, int rC, int bR, int bC) {
        visited = new boolean[N][M][N][M];
        Queue<Position> queue = new LinkedList<>();
        queue.add(new Position(rR, rC, bR, bC, 0));
        visited[rR][rC][bR][bC] = true;

        //이동할 방향 : 왼쪽, 오른쪽, 위, 아래
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        while (!queue.isEmpty()) {
            Position cur = queue.poll();

            //10번 이하의 이동만 허용
            if(cur.move >= 10) continue;

            //4가지 방향에 대해 기울여보기
            for (int i = 0; i < 4; i++) {
                //빨간 구슬 이동
                int[] redResult = moveMarble(cur.rR, cur.rC, dx[i], dy[i]);
                //파란 구슬 이동
                int[] blueResult = moveMarble(cur.bR, cur.bC, dx[i], dy[i]);

                int new_rR = redResult[0];
                int new_rC = redResult[1];
                int new_bR = blueResult[0];
                int new_bC = blueResult[1];
                int redCount = redResult[2];
                int blueCount = blueResult[2];

                //파란 구슬이 구멍에 빠졌다면 이 방향은 실패
                if(board[new_bR][new_bC] == 'O') continue;
                //빨간 구슬이 구멍에 빠졌다면 성공
                if (board[new_rR][new_rC] == 'O') return cur.move + 1;

                //두 구슬이 같은 위치에 있다면, 더 많이 이동한 구슬을 한 칸 뒤로 조정
                if (new_rR == new_bR && new_rC == new_bC) {
                    if (redCount > blueCount) {
                        new_rR -= dx[i];
                        new_rC -= dy[i];
                    } else {
                        new_bR -= dx[i];
                        new_bC -= dy[i];
                    }
                }

                //아직 방문하지 않은 상태라면 큐에 추가
                if (!visited[new_rR][new_rC][new_bR][new_bC]) {
                    visited[new_rR][new_rC][new_bR][new_bC] = true;
                    queue.add(new Position(new_rR, new_rC, new_bR, new_bC, cur.move + 1));
                }
            }
        }
        //10번 이하의 기울임으로 해결할 수 없으면 -1 반환
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();
        board = new char[N][M];

        int rR = 0, rC = 0; // 빨간 구슬의 시작 위치
        int bR = 0, bC = 0; // 파란 구슬의 시작 위치

        //보드 입력과 동시에 각 요소의 위치 저장
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
                if (board[i][j] == 'R') {
                    rR = i;
                    rC = j;
                }
                if (board[i][j] == 'B') {
                    bR = i;
                    bC = j;
                }
                if (board[i][j] == 'O') {
                    holeR = i;
                    holeC = j;
                }
            }
        }

        //BFS 탐색 후 결과 출력
        int result = bfs(rR, rC, bR, bC);
        System.out.println(result);
    }
}