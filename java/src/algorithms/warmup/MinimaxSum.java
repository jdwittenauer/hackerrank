package algorithms.warmup;

import java.util.*;
import java.util.stream.*;

public class MinimaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        long[] a = Stream.of(input.split(" ")).mapToLong(Long::parseLong).toArray();
        long min = Long.MAX_VALUE, max = 0;

        for (int i = 0; i < a.length; i++) {
            long sum = Arrays.stream(a).limit(i).sum() + Arrays.stream(a).skip(i + 1).sum();
            if (sum < min) min = sum;
            if (sum > max) max = sum;
        }

        System.out.printf("%s %s", min, max);
    }
}
