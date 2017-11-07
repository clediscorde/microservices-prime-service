package ca.caledi.primeservice.service;

import org.springframework.stereotype.Service;

@Service
public class PrimeService {

    public boolean isPrime(Long number) {

        if(number == null) {
            throw new IllegalArgumentException("number cannot be null");
        }

        long previousFactor = 1;
        for(long factor = 2; factor < number/previousFactor; factor++) {
            if (number % factor == 0)  {
                return false;
            }
            previousFactor = factor;
        }
        return true;
    }
}
