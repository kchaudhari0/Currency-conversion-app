package com.project.microservices.currency_exchange_service.Controller;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CircuitBreakerController {

    private Logger logger= LoggerFactory.getLogger(CircuitBreakerController.class);

    @GetMapping("/test-api")
    //@CircuitBreaker(name = "default" , fallbackMethod = "fallbackResponse")
    @RateLimiter(name = "default",  fallbackMethod = "fallbackResponse")
    //@Bulkhead(name = "test-api")
    public String testApi()
    {
        logger.info("Test API call recieved");
        ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:8080/some-dummy-url",
					String.class);
	    return forEntity.getBody();
    }

    public  String fallbackResponse(Exception ex){
        return "fallback-response";
    }
}
