package ArrayOperation;

public class ArrayOperation {

    private int[] arr;

    public ArrayOperation(int[] arr) {
        this.arr = arr;
    }

    public class Statics {
        double mean() {
            double sum = 0;
            for (int i : arr) {
                sum += i;

            }
            return sum / arr.length;
        }

        double median() {
            return 0;
        }
    }
}
