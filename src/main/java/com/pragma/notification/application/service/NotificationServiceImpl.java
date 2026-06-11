package com.pragma.notification.application.service;

import com.pragma.notification.domain.model.NotificationEvent;
import com.pragma.notification.domain.service.NotificationService;
import com.pragma.notification.infrastructure.adapter.NotificationAdapter;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class NotificationServiceImpl implements NotificationService {
    private final NotificationAdapter notificationAdapter;

    public NotificationServiceImpl(NotificationAdapter notificationAdapter) {
        this.notificationAdapter = notificationAdapter;
    }

    @Override
    public Mono<Void> sendNotification(NotificationEvent event) {
        return notificationAdapter.sendNotification(event);
    }
}