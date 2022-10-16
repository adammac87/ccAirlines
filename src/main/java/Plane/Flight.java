package Plane;

import AbClass.Customer.Passenger;
import AbClass.Staff.CrewMember;
import AbClass.Staff.Pilot;

import java.util.ArrayList;

public class Flight {
    private ArrayList<Pilot> pilots;
    private ArrayList<CrewMember> crewMembers;
    private ArrayList<Passenger> passengers;

    private String flightNumber;
    private String destinationAirport;
    private String departureAirport;
    private String departureTime;

    private int capacity;




    public Flight(String flightNumber,String destinationAirport, String departureAirport, String departureTime , int capacity){
        this.pilots= new ArrayList<>();
        this.crewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.flightNumber= flightNumber;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.departureTime= departureTime;
        this.capacity = capacity;


    }
    public String getFlightNumber(){
        return flightNumber;
    }

    public String getDestinationAirport(){
        return destinationAirport;
    }

    public String getDepartureAirport(){
        return departureAirport;
    }

    public String getDepartureTime(){
        return departureTime;
    }

    public int getPilots(){
        return pilots.size();
    }
    public int getPassengers(){
        return passengers.size();
    }
    public int getCrewMembers(){
        return crewMembers.size();
    }

    public void addPilot(Pilot pilot){
        this.pilots.add(pilot);
    }

    public void addCrewMember(CrewMember crewMember){
        this.crewMembers.add(crewMember);
    }

    public void addPassenger(Passenger passenger){
        if (this.countSeats() >0) {
            this.passengers.add(passenger);
        }
    }


    public int countSeats(){
       return (this.capacity - this.getPassengers());

    }

}
