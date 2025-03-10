package ConcatenateStringUsingMethod;


class StringConcatenate {
    public static String Concatenate(String... strings) {
        StringBuilder sb = new StringBuilder();

        for (String string : strings) {
            sb.append(string).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(Concatenate("asif", "reja"));
    }
}
