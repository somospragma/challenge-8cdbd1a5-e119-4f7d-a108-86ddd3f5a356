package com.pragma.notification.domain.model;

import java.time.Instant;

public class NotificationEvent {
    private String id;
    private String eventType;
    private String message;
    private Instant timestamp;

    public NotificationEvent(String id, String eventType, String message, Instant timestamp) {
        this.id = id;
        this.eventType = eventType;
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public String getEventType() {
        return eventType;
    }

    public String getMessage() {
        return message;
    }

    public Instant getTimestamp() {
        return timestamp;
    }
}