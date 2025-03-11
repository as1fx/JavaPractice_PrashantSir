package FunctionalProgamming;

import java.util.List;

public class ListConcatenateUsingStream {
    public static void main(String[] args) {
        List<String> lists = List.of("My Name is Asif Reja Mondal", "bad", "good", "I'm a Student", "in Dr. B.C Roy Engineering College", "song", "at Information Technology");
        String result = lists.stream()
                .filter(str -> str.length() > 10)
                .reduce("", (a, b) -> a + " " + b);
        System.out.println(result);
    }
}
