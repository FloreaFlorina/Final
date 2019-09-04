/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * [create type description]
 */
public class Spaceship implements Fly{

    private int amountOfFood ;
    private ArrayList<String> namesOfVisitedPlanets;
    private static final int FOOD_PER_MEMBER = 2;
    private ArrayList<String> crewMembersNames ;

    public Spaceship(final int amountOfFood) {
        this.amountOfFood = amountOfFood;
        this.namesOfVisitedPlanets = new ArrayList<>();
        this.crewMembersNames = new ArrayList<>();
    }

    public void board(String crewMemberName , int foodPerDay){
        this.crewMembersNames.add(crewMemberName);
    }
    public void unboard(String crewMemberName){

        this.crewMembersNames.remove(crewMemberName);
    }

    public int getPlanetsVisited() {
        this.namesOfVisitedPlanets.add("Jupiter");
        return this.namesOfVisitedPlanets.size();
    }

    public String getCrewMembersNames(){

        return String.valueOf(this.crewMembersNames);
    }

    public int getCrewMembersNumber(){
        int nr = this.crewMembersNames.size();
        return nr;
    }


    public boolean flyTo(String planetName , int daysRequired) {
        int numberOfCrewMembers = this.crewMembersNames.size();
        int needed = numberOfCrewMembers * FOOD_PER_MEMBER * daysRequired;
        if (this.amountOfFood >= needed) {
            this.namesOfVisitedPlanets.add(planetName);
            this.amountOfFood -= needed;
            return true;
        }
        else
            return false;
    }

}


