public enum Trial {
    Trial1("Track"), Trial2("Rope"), Trial3("Water");
    private String name;

    public String getName() {
        return name;
    }

    Trial(String name) {
        this.name = name;
    }
}
