package algorithms.warmup;

import java.util.*;
import java.util.stream.*;

public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String input = in.nextLine();
        int[] arr = Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = IntStream.of(arr).sum();
        System.out.println(sum);
    }
}
