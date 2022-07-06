package lesson1;

public class Cat implements Uchastnici {

    private String name;
    private int dis;
    private int height;

    public Cat(String name, int dis, int height) {
        this.name = name;
        this.dis = dis;
        this.height = height;
    }


    @Override
    public void run(int distance) {
        if (distance >= dis) {
            System.out.println("cat " + name + " ran " + distance + " distance");
        } else {
            System.out.println("cat " + name + " can't run through " + distance + " km" );
        }
    }

    @Override
    public void jump(int H) {
            if (H >= height) {
                System.out.println("cat " + name + " jumped through " + H + " m");
            } else {
                System.out.println("cat " + name + " can't jumped through " + H + " m" );
            }
        }
}
