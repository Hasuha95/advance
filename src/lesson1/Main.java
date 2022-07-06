package lesson1;

public class Main {
    public static void main(String[] args) {

        Obstacles[] obstacles = {
            new Track(50),
            new Wall(1),
            new Track(100),
            new Wall(3),
            new Track(200),
            new Wall(5)
        };

        Uchastnici[] uchastnici = {
                new Robot("2201", 1000, 5),
                new Cat("barsik", 70, 3),
                new Human("Masturbek", 500, 1)
        };


//        System.out.println(uchastnici[0].isOnDistance());
        for (Obstacles o: obstacles) {
            for (Uchastnici u: uchastnici) {
                if (u.isOnDistance() == true){
                    o.doIt(u);
                } else {
                    System.out.println(u.getRace() +" " + u.getName() + " can't overcome this obstacles");
                    break;
                }
            }
        }

//        Robot robot1 = new Robot("2201", 123, 12);
//        Track track1 = new Track(123);

    }
}
