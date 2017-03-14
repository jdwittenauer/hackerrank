package algorithms.warmup;

import java.util.*;
import java.util.stream.*;

public class VeryBigSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String input = in.nextLine();
        long[] arr = Stream.of(input.split(" ")).mapToLong(Long::parseLong).toArray();
        long sum = LongStream.of(arr).sum();
        System.out.println(sum);
    }
}
