package algorithms.warmup;

import java.util.*;
import java.util.stream.*;

public class CompareTriplets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int[] a = Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        input = in.nextLine();
        int[] b = Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();

        int a_score = 0;
        int b_score = 0;

        for (int x = 0; x < a.length; x++) {
            if (a[x] > b[x]) {
                a_score++;
            }
            else if (b[x] > a[x]) {
                b_score++;
            }
        }

        System.out.println(a_score + " " + b_score);
    }
}
