package lesson1;

public class Robot implements Uchastnici {
    private String race = "Robot";
    private String model;
    private int dis;
    private int height;
    private boolean isOnDistance = true;

    public Robot(String model, int dis, int height) {
        this.model = model;
        this.dis = dis;
        this.height = height;
    }


    public void run(int distance) {
        if (distance <= dis) {
            System.out.println("robot " + model + " ran " + distance + " m of distance");
        } else {
//            System.out.println("robot " + model + " can't run through " + distance + " m" );
            isOnDistance = false;
        }
    }

    @Override
    public void jump(int H) {
        if (H <= height) {
            System.out.println("robot " + model + " jumped through " + H + " m");
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
        return getName();
    }

}
