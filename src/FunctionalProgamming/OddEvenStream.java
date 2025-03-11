package FunctionalProgamming;

import java.util.List;

public class OddEvenStream {
    public static void main(String[] args) {
        List<Integer> number = List.of(21, 12, 11, 5, 7, 8, 10, 32);

        number.stream().filter(oddNum -> oddNum % 2 == 1).forEach(System.out::println);

    }
}
