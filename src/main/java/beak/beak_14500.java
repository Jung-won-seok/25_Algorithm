package beak;

import java.util.Scanner;

public class beak_14500 {
    static int N, M, max = Integer.MIN_VALUE;
    static int[][] map;
    static boolean[][] visited;
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                visited[i][j] = true;
                dfs(i, j, 1, map[i][j]);
                visited[i][j] = false;
                combi(0, 0, i, j, map[i][j]);
            }
        }

        System.out.println(max);
    }

    private static void combi(int cnt, int start, int y, int x, int sum) {
        if (cnt == 3) {
            max = Math.max(max, sum);
            return;
        }
        for (int d = start; d < 4; d++) {
            int ny = y + dy[d];
            int nx = x + dx[d];
            if(ny < 0 || ny >= N || nx < 0 || nx >= M) continue;
            combi(cnt+1, d+1, y, x, sum+map[ny][nx]);
        }
    }

    private static void dfs(int y, int x, int cnt, int sum) {
        if (cnt == 4) {
            max = Math.max(max, sum);
            return;
        }
        for (int d = 0; d < 4; d++) {
            int ny = y + dy[d];
            int nx = x + dx[d];
            if(ny < 0 || ny >= N || nx < 0 || nx >= M) continue;
            if(visited[ny][nx]) continue;
            visited[ny][nx] = true;
            dfs(ny, nx, cnt + 1, sum + map[ny][nx]);
            visited[ny][nx] = false;
        }
    }
}