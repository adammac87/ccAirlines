package Plane;

import AbClass.Customer.Passenger;
import AbClass.Staff.CrewMember;
import AbClass.Staff.Pilot;

import java.util.ArrayList;

public class Flight {
    private ArrayList<Pilot> pilots;
    private ArrayList<CrewMember> crewMembers;
    private ArrayList<Passenger> passengers;

    private int flightNumber;
    private String destinationAirport;
    private String departureAirport;
    private String departureTime;




    public Flight(){
        this.pilots= new ArrayList<>();
        this.crewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.flightNumber= flightNumber;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.departureTime= departureTime;


    }

}
