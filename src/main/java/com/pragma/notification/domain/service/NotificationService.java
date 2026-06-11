package com.pragma.notification.domain.service;

import com.pragma.notification.domain.model.NotificationEvent;
import reactor.core.publisher.Mono;

public interface NotificationService {
    Mono<Void> sendNotification(NotificationEvent event);
}