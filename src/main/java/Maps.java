/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */

import java.util.HashMap;
import java.util.HashSet;

/**
 * [create type description]
 */
public class Maps {

    private HashMap<String, String> mp1;
    private HashMap<String, String> mp2;


    public Maps(final HashMap<String, String> mp1, final HashMap<String, String> mp2) {
        this.mp1 = mp1;
        this.mp2 = mp2;
    }

    public static boolean isSubMap(HashMap mp1, HashMap mp2) {

        int elements = 0 ;

        if (mp1.keySet().equals(mp2.keySet())) {
            System.out.println("They have the exact Keys");
            return true;
        }
        if(mp1.isEmpty()){
            System.out.println("The first HashMap is empty");
            return true;
        }
        for (Object key1 : mp1.keySet()) {
            for(Object key2 : mp1.keySet())
                if(mp1.get(key1).equals(mp1.get(key2))) {
                    elements++;
                }
        }
        if(elements == mp1.size()){
            return true;
        }

        return false;

    }
    }



