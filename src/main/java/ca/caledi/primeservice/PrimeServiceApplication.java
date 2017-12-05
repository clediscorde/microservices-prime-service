package ca.caledi.primeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PrimeServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PrimeServiceApplication.class, args);
    }
}
