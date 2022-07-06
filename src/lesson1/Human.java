package lesson1;

public class Human implements Uchastnici {
    private String race = "Human";
    private String name;
    private int dis;
    private int height;
    private boolean isOnDistance = true;

    public Human(String name, int dis, int height) {
        this.name = name;
        this.dis = dis;
        this.height = height;
    }

    public void run(int distance) {
        if (distance <= dis) {
            System.out.println("human " + name + " ran " + distance + " m of distance");
        } else {
            isOnDistance = false;
        }
    }

    public void jump(int H) {
        if (H <= height) {
            System.out.println("human " + name + " jumped through " + H + " m");
        } else {
            isOnDistance = false;
        }
    }

    public boolean isOnDistance() {
        return isOnDistance;
    }

    public String getRace() {
        return race;
    }

    @Override
    public String getName() {
        return name;
    }
}

