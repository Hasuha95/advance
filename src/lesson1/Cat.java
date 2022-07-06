package lesson1;

public class Cat implements Uchastnici {
    private String race = "Cat";
    private String name;
    private int dis;
    private int height;
    private boolean isOnDistance = true;

    public Cat(String name, int dis, int height) {
        this.name = name;
        this.dis = dis;
        this.height = height;
    }


    @Override
    public void run(int distance) {
        if (distance <= dis) {
            System.out.println("cat " + name + " ran " + distance + " m of distance");
        } else {
            isOnDistance = false;
        }
    }

    @Override
    public void jump(int H) {
            if (H <= height) {
                System.out.println("cat " + name + " jumped through " + H + " m");
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

    public String getName() {
        return name;
    }
}
