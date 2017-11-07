package ca.caledi.primeservice.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeServiceTest {
    private PrimeService primeFinder = new PrimeService();

    @Test
    public void testIsPrimeWhen2ThenReturnTrue() {
        assertTrue(primeFinder.isPrime(2l));
    }

    @Test
    public void testIsPrimeWhen3ThenReturnTrue() {
        assertTrue(primeFinder.isPrime(3l));
    }

    @Test
    public void testIsPrimeWhen4ThenReturnFalse() {
        assertFalse(primeFinder.isPrime(4l));
    }

    @Test
    public void testIsPrimeWhen33ThenReturnFalse() {
        assertFalse(primeFinder.isPrime(33l));
    }
}