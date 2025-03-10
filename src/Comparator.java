import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear", "Zebra", "Lion", "Ant");
        System.out.println("Before Sorting: " + list);
        System.out.println("After Sorting: " + sortInDescending(list));
    }

    public static List<String> sortInDescending(List<String> stringList) {
        Collections.sort(stringList, new java.util.Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // Descending order
            }
        });
        return stringList;
    }
}
