package beak;

import java.util.Scanner;

public class beak_13458 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int B = sc.nextInt(); //총감독관
        int C = sc.nextInt(); //부감독관

        long total = 0;
        for (int i = 0; i < N; i++) {
            total++;
            int remain = A[i] - B;
            if (remain > 0) {
                int sub = remain % C == 0 ? remain / C : remain / C + 1;
                total += sub;
            }
        }

        System.out.println(total);
    }
}
