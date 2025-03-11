package FunctionalProgamming;

import java.util.List;

public class ArrayStream {
    public static void main(String[] args) {
        List<String> list = List.of("Mustang", "Mercedes", "Audi", "Bugati", "Koeinsegg");
        list.stream()
                .forEach(lists -> System.out.println(list));
    }
}
