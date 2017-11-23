package algorithms.warmup;

import java.util.*;
import java.util.stream.*;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String input = in.nextLine();
        int[] a = Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        int a_max = Arrays.stream(a).max().getAsInt();
        long candles = Arrays.stream(a).filter(x -> x == a_max).count();
        System.out.println(candles);
    }
}
