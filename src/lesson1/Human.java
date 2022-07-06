package lesson1;

public class Human implements Uchastnici {
    private String name;
    private int dis;
    private int height;

    public Human(String name, int dis, int height) {
        this.name = name;
        this.dis = dis;
        this.height = height;
    }

    public void run(int distance) {
        if (distance <= dis) {
            System.out.println("human " + name + " ran " + distance + " m of distance");
        } else {
            System.out.println("human " + name + " can't run through " + distance + " m" );
        }
    }

    public void jump(int H) {
        if (H <= height) {
            System.out.println("human " + name + " jumped through " + H + " m");
        } else {
            System.out.println("human " + name + " can't jumped through " + H + " m" );
        }
    }
}

