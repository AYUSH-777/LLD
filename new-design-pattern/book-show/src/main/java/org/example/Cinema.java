package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String cinemaId;
    private String cinemaName;
    private List<Show> showList;

    public Cinema(String cinemaId, String cinemaName) {
        this.cinemaId = cinemaId;
        this.cinemaName = cinemaName;
        this.showList = new ArrayList<>();
    }

    public void addShow(Show show)
    {
        showList.add(show);
    }

    public String getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(String cinemaId) {
        this.cinemaId = cinemaId;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public List<Show> getShowList() {
        return showList;
    }

    public void setShowList(List<Show> showList) {
        this.showList = showList;
    }
}
