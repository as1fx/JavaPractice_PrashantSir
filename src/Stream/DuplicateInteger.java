package Stream;

import java.util.List;

public class DuplicateInteger {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 1, 4, 1, 3, 4, 2, 6, 7, 8, 9);

        List<Integer> removeDup = numbers.stream()
                .distinct()
                .toList();

        System.out.println(numbers);
        System.out.println(removeDup);
    }
}
