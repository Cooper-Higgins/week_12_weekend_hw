public enum CabinCrewMember {
    CHIEFPURSER("Ewan", "Chief Purser"),
    PURSER("Connie", "Purser"),
    FLIGHTATTENDANT("Richard", "Flight Attendant");

    private final String name;
    private final String rank;

    CabinCrewMember(String name, String rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public String cabinBanter(){
        return "Would you like a slice of lemon with that?";
    }
}
