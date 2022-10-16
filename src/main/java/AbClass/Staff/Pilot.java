package AbClass.Staff;

import AbClass.Person;

public class Pilot extends Person {

    private String rank;

    private String pilotsLicense;


    public Pilot(String name,String rank, String pilotsLicense) {
        super(name);
        this.rank = rank;
        this.pilotsLicense = pilotsLicense;
    }

    public String getRank(){
        return rank;
    }


    public String getPilotsLicense(){
        return pilotsLicense;
    }

    public String flyPlane(){
        return "lets fly";
    }
}

