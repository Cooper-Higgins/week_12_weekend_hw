import java.util.ArrayList;

public class Flight {
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private Pilot pilot;
    private Plane plane;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> manifest;

    public Flight(String flightNumber, String destination, String departureAirport, String departureTime){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.plane = Plane.BOEING747;
        this.pilot = Pilot.CAPTAIN;
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
        this.manifest = new ArrayList<Passenger>();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public void setCabinCrewMembers(ArrayList<CabinCrewMember> cabinCrewMembers) {
        this.cabinCrewMembers = cabinCrewMembers;
    }

    public ArrayList<Passenger> getManifest() {
        return manifest;
    }

    public void setManifest(ArrayList<Passenger> manifest) {
        this.manifest = manifest;
    }

    public int availableSeats(){
        int totalCapacity = plane.getCapacity();
        int manifestLength = this.manifest.toArray().length;
        return totalCapacity - manifestLength;
    }

    public void addPassengerToFlight(Passenger passenger){
        if (this.manifest.toArray().length < this.availableSeats());
        this.manifest.add(passenger);
    }
}
