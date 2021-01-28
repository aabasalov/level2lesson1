public class Man {
    protected String name;

    public Man(String name) {
        this.name = name;
    }

    public void run(Track track) {
        System.out.println(this.name + " run " + track.getDistance() + " meters!");
    }

    public void jump(Wall wall) {
        System.out.println(this.name + " jump " + wall.getHeight() + " meters!");
    }

}
