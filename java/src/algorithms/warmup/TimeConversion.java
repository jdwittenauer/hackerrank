package algorithms.warmup;

import java.time.*;
import java.time.format.*;
import java.util.*;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ssa");
        LocalTime time = LocalTime.parse(input, format);
        System.out.println(time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}
