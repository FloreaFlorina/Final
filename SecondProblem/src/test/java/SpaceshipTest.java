import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * [create type description]
 */
public class SpaceshipTest {

    private Spaceship mySpaceship;

    @Before

    public void createSpaceship (){

        mySpaceship = new Spaceship(1000);
    }

    @Test

    public void testFly(){

        mySpaceship.board("Florina",1);
        mySpaceship.board("Diana",1);

        assertEquals(2,mySpaceship.getCrewMembersNumber());

    }

    @Test

    public void testUnboard(){

        mySpaceship.board("Florina",1);
        mySpaceship.board("Diana",1);
        mySpaceship.board("Ale",1);

        mySpaceship.unboard("Florina");
        mySpaceship.unboard("Ale");
        assertEquals(1,mySpaceship.getCrewMembersNumber());

    }

    @Test

    public void flyTest (){

        mySpaceship.board("Florina",1);
        assertTrue(mySpaceship.flyTo("Marte",1));


    }

    @Test

    public void planetsVisitedTest () {

        assertEquals(1,mySpaceship.getPlanetsVisited());
    }










}