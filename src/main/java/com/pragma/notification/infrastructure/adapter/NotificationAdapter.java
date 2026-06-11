package com.pragma.notification.infrastructure.adapter;

import com.pragma.notification.domain.model.NotificationEvent;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class NotificationAdapter {
    public Mono<Void> sendNotification(NotificationEvent event) {
        // Simulate sending notification
        return Mono.just(event)
               .doOnNext(e -> System.out.println("Sending notification: " + e.getMessage()))
               .then();
    }
}