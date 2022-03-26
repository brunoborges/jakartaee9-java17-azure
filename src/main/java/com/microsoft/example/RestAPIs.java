package com.microsoft.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/numbers")
public class RestAPIs {

    @GET
    @Path("/rng")
    public String getRandomNumber() {
        return "Random number: " + (int) (Math.random() * 100);
    }

    @GET
    @Path("/fibonacci")
    public String getRandomFibonacci() {
        return "Random fibonacci number: " + findRandomFibonacciNumber();
    }

    private long findRandomFibonacciNumber() {
        var fibonacciSequence = new long[200];
        fibonacciSequence[0] = 0;
        fibonacciSequence[1] = 1;
        for (int i = 2; i < fibonacciSequence.length; i++) {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }
        return fibonacciSequence[(int) (Math.random() * 1000)];
    }

}
