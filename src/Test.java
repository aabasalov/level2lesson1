public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Remus");
        Man man = new Man("Garik");
        Robot robot = new Robot("Xiaomi");
        Track track = new Track(5);
        Wall wall = new Wall(2);

        cat.run(track);
        man.run(track);
        robot.run(track);

        cat.jump(wall);
        man.jump(wall);
        robot.jump(wall);

        for(Players players : Players.values()) {
            for (Trial trial : Trial.values()) {
                System.out.println(players.getName() + " get " + trial.getName());
            }
        }


    }
}
