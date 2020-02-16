package com.oblivion;

import java.util.ArrayList;

public class PrimeFactors {
    public ArrayList<Integer> getPrimeFactors(int i) {
        ArrayList<Integer> result = new ArrayList<>();
        int index = 2;
        for (; i > 1; ) {
            while (i % index == 0) {
                result.add(index);
                i /= index;
            }
            index++;
        }
        return result;
    }

}
