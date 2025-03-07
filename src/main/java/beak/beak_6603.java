package beak;

import java.util.Scanner;

public class beak_6603 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int K = sc.nextInt();
            if (K == 0) {
                break;
            }
            int[] S = new int[K];
            for (int i = 0; i < S.length; i++) {
                S[i] = sc.nextInt();
            }
            for (int i = 0; i < S.length; i++) {
                System.out.print(S[i] + " ");
            }
            System.out.println();
        }

    }
}