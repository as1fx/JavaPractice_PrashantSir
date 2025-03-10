package Enums;

public class TestDay {
    public static void main(String[] args) {
        for (Day value : Day.values()) {
            System.out.printf("%s ", Day.valueOf(String.valueOf(value)));
        }
    }
}
