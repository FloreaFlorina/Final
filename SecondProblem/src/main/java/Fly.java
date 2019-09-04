/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */

/**
 * [create type description]
 */
public interface Fly {

    public boolean flyTo(String planetName , int daysRequired);
    public int getPlanetsVisited();
    public void unboard(String crewMemberName);
    public void board(String crewMemberName , int foodPerDay);
    public int getCrewMembersNumber();


}
