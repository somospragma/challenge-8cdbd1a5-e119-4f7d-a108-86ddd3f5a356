package com.pragma.notification.infrastructure.controller;

import com.pragma.notification.domain.model.NotificationEvent;
import com.pragma.notification.domain.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {
    private final NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public Mono<Void> sendNotification(@RequestBody NotificationEvent event) {
        return notificationService.sendNotification(event);
    }
}