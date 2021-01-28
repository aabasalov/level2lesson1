public class Cat {
    protected String name;

    public Cat(String name) {
        this.name = name;
    }

    public void run(Track track) {
        System.out.println(this.name + " run " + track.getDistance() + " meters!");
    }

    public void jump(Wall wall) {
        System.out.println(this.name + " jump " + wall.getHeight() + " meters!");
    }

}
