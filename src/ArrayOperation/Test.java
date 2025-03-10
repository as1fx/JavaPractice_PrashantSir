package ArrayOperation;

public class Test {

    public static void main(String[] args) {

        ArrayOperation opr = new ArrayOperation(new int[]{1, 2, 3, 4});
        ArrayOperation.Statics statics = opr.new Statics();
        System.out.println(statics.mean());
    }
}
