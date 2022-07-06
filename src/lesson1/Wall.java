package lesson1;

public class Wall implements Obstacles{
    private int Height;

    public Wall(int hight) {
        this.Height = hight;
    }

    public int getInfo() {
        return Height;
    }

    @Override
    public void doIt(Uchastnici uchastnic) {

    }
}
