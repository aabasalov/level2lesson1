public enum Players {
    Player1("Victor"), Player2("Harry"), Player3("Ben");
    private String name;

    public String getName() {
        return name;
    }

    Players(String name) {
        this.name = name;
    }
}
