package algorithms.warmup;

import java.util.*;
import java.util.stream.*;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String input = in.nextLine();
        int[] a = Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();

        int pos = 0, neg = 0, zero = 0;
        for (int x : a) {
            if (x > 0) {
                pos++;
            }
            else if (x < 0) {
                neg++;
            }
            else {
                zero++;
            }
        }

        System.out.println((float) pos / n);
        System.out.println((float) neg / n);
        System.out.println((float) zero / n);
    }
}
