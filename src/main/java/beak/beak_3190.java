package beak;

import java.util.ArrayList;
import java.util.Scanner;

public class beak_3190 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N*N의 보드 크기
        int K = sc.nextInt(); // 사과의 갯수 K개

        //사과의 위치
        ArrayList<Pair> pairs = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            pairs.add(new Pair(a, b));
        }
        //뱀이 움직인 경로
        int L = sc.nextInt();
        ArrayList<Entry> entries = new ArrayList<>();

        for (int i = 0; i < L; i++) {
            int num = sc.nextInt();
            char dir = sc.next().charAt(0);
            entries.add(new Entry(num, dir));
        }

    }

    static class Entry {
        int number;
        char direction;

        public Entry(int number, char direction) {
            this.number = number;
            this.direction = direction;
        }
    }

    static class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
