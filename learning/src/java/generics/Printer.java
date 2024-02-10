package generics;

public class Printer<T> {
    private final T data;

    public Printer(T data) {
        this.data = data;
    }

    public void print() {
        System.out.println("print::: " + data);
    }
}
