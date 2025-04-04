package beak;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class beak_16198 {
    static int N;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 4

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        charge(list, 0);
        System.out.println(max);

    }
    static void charge(List<Integer> list, int sum) {
        if (list.size() == 2) {
            max = Math.max(max, sum);
            return;
        }

        for (int i = 1; i < list.size()-1; i++) {
            int tmp = list.get(i);
            int chargeValue = list.get(i - 1) * list.get(i + 1);
            list.remove(i);
            charge(list, sum + chargeValue);
            list.add(i, tmp);
        }
    }
}