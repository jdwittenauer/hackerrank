package algorithms.warmup;

import java.util.*;

public class Staircase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        for (int i = 0; i < n; i++) {
            String spaces = "";
            for (int j = 0; j < (n - 1) - i; j++) {
                spaces += " ";
            }

            String pounds = "";
            for (int k = 0; k < i + 1; k++) {
                pounds += "#";
            }

            System.out.println(spaces + pounds);
        }
    }
}
