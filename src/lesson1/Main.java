package lesson1;

public class Main {
    public static void main(String[] args) {

        Obstacles[] obstacles = {
            new Track(50),
            new Wall(1),
            new Track(70),
            new Wall(2),
            new Track(100),
            new Wall(3)
        };

        Uchastnici[] uchastnici = {
                new Robot("2201", 1000, 5),
                new Cat("barsik", 70, 3),
                new Human("Masturbek", 500, 1)
        };



        for (Obstacles o: obstacles) {
            for (Uchastnici u: uchastnici) {
                o.doIt(u);
            }
        }

//        Robot robot1 = new Robot("2201", 123, 12);
//        Track track1 = new Track(123);

    }
}
