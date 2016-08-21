/**
 * Most frequent integer
 *
 * August 2016 - jbisa <jay.bisa@gmail.com>
 */
package com.questions;

import java.util.Map;
import java.util.HashMap;

/**
 * QUESTION:
 *
 * Find the most frequent integer in an array.
 *
 */
public class MostFrequentInteger {

    public static void main(String[] args) {

        int[] myArray = {1,5,4,4,22,4,9,4,4,8};
        Map<Integer,Integer> arrayCounts = new HashMap<>();
        Integer popularCount  = 0;
        Integer popularValue = 0;

        for(int i = 0; i < myArray.length; i++) {
            Integer count = arrayCounts.get(myArray[i]);
            if (count == null) {
                count = 0;
            }
            arrayCounts.put(myArray[i], count == 0 ? 1 : ++count);
            if (count > popularCount) {
                popularCount = count;
                popularValue = myArray[i];
            }
        }

        // Output most frequent integer
        System.out.println(popularValue + " --> " + popularCount);

        // Double check that your answer is correct
        System.out.println(arrayCounts.entrySet());
    }
}
