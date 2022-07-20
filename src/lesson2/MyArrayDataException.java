package lesson2;

public class MyArrayDataException extends Exception{
    private int x;
    private int y;

    public MyArrayDataException(String message, int x, int y) {
        super(message);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
