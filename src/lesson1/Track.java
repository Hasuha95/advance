package lesson1;

public class Track implements Obstacles{
    private int distanсe;

    public Track(int distanсe) {
        this.distanсe = distanсe;
    }


    public int getInfo() {
        return distanсe;
    }

    @Override
    public void doIt(Uchastnici uchastnic) {
        uchastnic.run(distanсe);
    }

}
