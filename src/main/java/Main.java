/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * [create type description]
 */
public class Main {

    public static void main(String[] args) {

        HashMap<String,String> map1 = new HashMap<String, String>();
        HashMap<String,String> map2 = new HashMap<String, String>();

        map1.put("1","Florina");
        map1.put("2","Diana");
        map1.put("3","Denisa");

        map2.put("3","Tabita");
        map2.put("2","Luca");
        map2.put("1","Norbi");


        Set<Map.Entry<String,String>> hashSet=map1.entrySet();
        for(Map.Entry entry:hashSet ) {

            System.out.println("Key = "+entry.getKey()+", Value = "+entry.getValue());
        }

        System.out.println();

        Set<Map.Entry<String,String>> hashSet2=map2.entrySet();
        for(Map.Entry entry:hashSet2 ) {

            System.out.println("Key = "+entry.getKey()+", Value = "+entry.getValue());
        }

        System.out.println("------------------------------");

        if (Maps.isSubMap(map1, map2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }



    }
}
