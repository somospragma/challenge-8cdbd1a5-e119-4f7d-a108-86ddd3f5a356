package com.pragma.notification.infrastructure.config;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

@Configuration
public class ErrorHandlingConfig {
    @CircuitBreaker(name = "notificationService", fallbackMethod = "fallback")
    public Mono<Void> handleError(Mono<Void> result) {
        return result;
    }

    public Mono<Void> fallback(Throwable t) {
        return Mono.error(t);
    }
}