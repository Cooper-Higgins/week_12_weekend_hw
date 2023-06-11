public enum Pilot {

    CAPTAIN("Zoe", "Captain", "A12345");

    private final String name;
    private final String rank;
    private final String licence;

    Pilot(String name, String rank, String licence){
        this.name = name;
        this.rank = rank;
        this.licence = licence;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public String getLicence() {
        return licence;
    }

    public String flyPlane(){
        return "This is your Captain speaking";
    }
}
