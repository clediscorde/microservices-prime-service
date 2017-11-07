package ca.caledi.primeservice.controller;

import ca.caledi.primeservice.service.PrimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeServiceController {

    @Autowired
    private PrimeService primeService;

    @RequestMapping("/isPrime")
    public Boolean isPrime(@RequestParam("number") Long number) {
        return primeService.isPrime(number);
    }
}
