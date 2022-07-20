package lesson2;

public class MyArraySizeException extends Exception {
    private int a;
    private int b;


    public MyArraySizeException(String message, int a, int b) {
        super(message);
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
