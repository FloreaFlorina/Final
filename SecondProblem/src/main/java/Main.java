/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */

/**
 * [create type description]
 */
public class Main {

    public static void main(String[] args) {

        Spaceship myShip = new Spaceship(100);
        System.out.println("Attempt to fly");
        System.out.println("----------------------------------->");
        if (myShip.flyTo("Marte", 2)) {
            System.out.println("Fly SUCCESS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println();
        System.out.println("List of the visited planets: " + myShip.getPlanetsVisited());

        myShip.board("Florina",2);
        myShip.board("Diana",3);
        System.out.println("Crew members : " + myShip.getCrewMembersNames());
        myShip.unboard("Florina");
        System.out.println("Crew members after 1 remove : " + myShip.getCrewMembersNames());
        System.out.println();


    }
}
