package org.example;

import java.util.ArrayList;
import java.util.List;

public class Show {
    private String showId;
    private Movie movie;
    private String startTime;
    private String endTime;
    private List<Seat> seatList;

    public Show(String showId, Movie movie, String startTime, String endTime) {
        this.showId = showId;
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = endTime;
        this.seatList = new ArrayList<>();
    }

    public void addSeat(Seat seat)
    {
        seatList.add(seat);
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }
}
