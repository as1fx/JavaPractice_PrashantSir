package FunctionalProgamming;

import java.util.function.BinaryOperator;

public class LambdaExpressionMultiplication {
    public static void main(String[] args) {
        BinaryOperator<Integer> multi = (a, b) -> a * b;
        int result = multi.apply(2, 4);
        System.out.println(result);
    }
}


