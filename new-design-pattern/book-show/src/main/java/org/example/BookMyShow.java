package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookMyShow {
    private Map<City, List<Cinema>> cinmasByCityMap;

    private List<Booking> bookingList;

    private List<Payment> paymentList;

    public BookMyShow() {
        cinmasByCityMap = new HashMap<>();
        bookingList = new ArrayList<>();
        paymentList = new ArrayList<>();
    }


    public void addCinema(City city,Cinema cinema)
    {
        List<Cinema> cinemaList = new ArrayList<>();
        if(cinmasByCityMap.containsKey(city))
        {
            cinemaList = cinmasByCityMap.get(city);
        }
        cinemaList.add(cinema);
        cinmasByCityMap.put(city,cinemaList);
    }

    public void addBooking(Booking booking)
    {
        bookingList.add(booking);
    }

    public void addPayment(Payment payment)
    {
        paymentList.add(payment);
    }

    public Booking bookSeat(User user,City city,String movie)
    {
        List<Cinema> emptyList = new ArrayList<>();
        List<Cinema> cinemaList = cinmasByCityMap.getOrDefault(city,emptyList);
        for(Cinema curCinema:cinemaList)
        {
            List<Show> showList = curCinema.getShowList();
            for(Show curShow:showList)
            {
                if(curShow.getMovie().getMovieName().equals(movie))
                {
                    List<Seat> seatList = curShow.getSeatList();
                    for(Seat curSeat:seatList)
                    {
                        if(curSeat.isAvailable()&&curSeat.getPrice()<=user.getBalanceAmt())
                        {
                            curSeat.setAvailable(false);
                            user.setBalanceAmt(user.getBalanceAmt()-curSeat.getPrice());
                            return new Booking("501",user,curShow,curCinema.getCinemaId(),curSeat);
                        }
                    }
                }
            }
        }
        return null;
    }

    public Map<City, List<Cinema>> getCinmasByCityMap() {
        return cinmasByCityMap;
    }

    public void setCinmasByCityMap(Map<City, List<Cinema>> cinmasByCityMap) {
        this.cinmasByCityMap = cinmasByCityMap;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }
}
