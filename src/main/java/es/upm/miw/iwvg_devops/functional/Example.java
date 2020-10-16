package es.upm.miw.iwvg_devops.functional;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 100);

        int factor = 2;
        System.out.println(
                numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(e -> e * factor)
                .sum());
    }
}
