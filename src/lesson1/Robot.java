package lesson1;

public class Robot implements Uchastnici {
    private String model;
    private int dis;
    private int height;

    public Robot(String model, int dis, int height) {
        this.model = model;
        this.dis = dis;
        this.height = height;
    }


    public void run(int distance) {
        if (distance >= dis) {
            System.out.println("robot " + model + " ran " + distance + " distance");
        } else {
            System.out.println("robot " + model + " can't run through " + distance + " km" );
        }
    }

    @Override
    public void jump(int H) {
        if (H >= height) {
            System.out.println("robot " + model + " jumped through " + H + " m");
        } else {
            System.out.println("robot " + model + " can't jumped through " + H + " m" );
        }
    }

}
