package algorithms.warmup;

import java.util.*;
import java.util.stream.*;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][];
        in.nextLine();

        for (int i = 0; i < n; i++) {
            String input = in.nextLine();
            int[] row = Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            a[i] = row;
        }

        int diag1 = 0, diag2 = 0;
        for (int x = 0; x < n; x++) {
            diag1 += a[x][x];
            diag2 += a[x][(n - 1) - x];
        }

        System.out.println(Math.abs(diag1 - diag2));
    }
}
