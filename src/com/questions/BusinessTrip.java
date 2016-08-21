/**
 * Business trip
 *
 * August 2016 - jbisa <jay.bisa@gmail.com>
 */
package com.questions;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

/**
 * QUESTION:
 *
 * You are on a business trip and travelling from one city to another. You have a stack of unsorted flight boarding
 * passes. Only departure city and destination city are on the boarding pass. Hw do you find the first departure city
 * and your final destination city?
 *
 */
public class BusinessTrip {

    public static void main(String[] args) {

        Map<String, String> flights = new HashMap<String, String>();

        // Init flights (Departure, Arrival)
        flights.put("Boston", "NYC");
        flights.put("NYC", "Atlanta");
        flights.put("Atlanta", "Houston");
        flights.put("Houston", "San Diego");

        Map<String, Integer> locationCounts = new HashMap<String, Integer>();

        // Init location counts
        Iterator it = flights.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey() + " --> " + pair.getValue());
            locationCounts.put(pair.getKey().toString(), 0);
            locationCounts.put(pair.getValue().toString(), 0);
        }


        // Now -1 to departure location count and +1 to arrival location count
        Iterator it_locations = flights.entrySet().iterator();
        while(it_locations.hasNext()) {
            Map.Entry pair = (Map.Entry) it_locations.next();
            locationCounts.computeIfPresent(pair.getKey().toString(), (k, v) -> v - 1);
            locationCounts.computeIfPresent(pair.getValue().toString(), (k, v) -> v + 1);
        }

        System.out.println("");

        // -1 location is your initial Departure location and +1 is final arrival location
        Iterator it_locations2 = locationCounts.entrySet().iterator();
        while(it_locations2.hasNext()) {
            Map.Entry pair = (Map.Entry)it_locations2.next();
            System.out.println(pair.getKey() + " --> " + pair.getValue());
        }
    }
}
