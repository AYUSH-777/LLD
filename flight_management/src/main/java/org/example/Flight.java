package org.example;

public class Flight {
    String flightId;
    String source;
    String destination;
    int price;

    public Flight(String flightId, String source, String destination, int price) {
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.price = price;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
