package AbClass.Staff;

import AbClass.Customer.Passenger;
import AbClass.Person;

public class CrewMember extends Person {
    private String rank;




    public CrewMember(String name,String rank){
        super(name);
        this.rank = rank;
    }

    public String getRank(){
        return rank;
    }

    public String relayMessage(){
        return "message";
    }

}
