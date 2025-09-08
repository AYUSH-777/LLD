package org.example;

enum EventType {
    MOVIE,
    STANDUP_COMEDY,
    CONCERT
}

public class Event {
    private String eventId;
    private EventType eventType;
    private String eventName;

    public Event(String eventId, EventType eventType, String eventName)
    {
        this.eventId = eventId;
        this.eventType = eventType;
        this.eventName = eventName;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}
