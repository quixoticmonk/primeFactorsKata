package com.oblivion;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;


public class PrimeFactorsTest {
    PrimeFactors primeFactors = new PrimeFactors();

    @Test
    public void shouldRetur2for2(){
        List<Integer> expected = asList(2);
        assertEquals(expected,primeFactors.getPrimeFactors(2));
    }

    @Test
    public void shouldRetur3for3(){
        List<Integer> expected = asList(3);
        assertEquals(expected,primeFactors.getPrimeFactors(3));
    }

    @Test
    public void shouldReturnNothingfor1(){
        List<Integer> expected = asList();
        assertEquals(expected,primeFactors.getPrimeFactors(1));
    }

    @Test
    public void valuesFor4(){
        List<Integer> expected = asList(2,2);
        assertEquals(expected,primeFactors.getPrimeFactors(4));
    }

    @Test
    public void valuesFor6(){
        List<Integer> expected = asList(2,3);
        assertEquals(expected,primeFactors.getPrimeFactors(6));
    }

    @Test
    public void valuesFor8(){
        List<Integer> expected = asList(2,2,2);
        assertEquals(expected,primeFactors.getPrimeFactors(8));
    }

    @Test
    public void valuesFor9(){
        List<Integer> expected = asList(3,3);
        assertEquals(expected,primeFactors.getPrimeFactors(9));
    }

    @Test
    public void valuesFor75(){
        List<Integer> expected = asList(3,5,5);
        assertEquals(expected,primeFactors.getPrimeFactors(75));
    }

}
