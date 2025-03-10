package InterfaceClass;

public abstract class Bird implements Flyable {

    public static class Eagle extends Bird {

        @Override
        public String fly() {
            return "The eagle is Flying...";
        }
    }

}
