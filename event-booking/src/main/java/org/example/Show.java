package org.example;

public class Show {
    private String showId;
    private String eventId;
    private Long eventStart;
    private Long eventEnd;

    public Show(String showId, String eventId, Long eventStart, Long eventEnd) {
        this.showId = showId;
        this.eventId = eventId;
        this.eventStart = eventStart;
        this.eventEnd = eventEnd;
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public Long getEventStart() {
        return eventStart;
    }

    public void setEventStart(Long eventStart) {
        this.eventStart = eventStart;
    }

    public Long getEventEnd() {
        return eventEnd;
    }

    public void setEventEnd(Long eventEnd) {
        this.eventEnd = eventEnd;
    }
}
