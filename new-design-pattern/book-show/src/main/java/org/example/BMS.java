package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BMS {
    public static void main(String[] args) {
          BookMyShow bookMyShow = new BookMyShow();
          User user1 = new User("601","Ayush",200);
          City city1 = new City("1","Delhi");
//          City city2 = new City("2","Bangalore");
          Cinema cinema1 = new Cinema("101","Golcha");
          Show show1 = new Show("201",new Movie("301","Jawaan",MovieType.THRILLER),"01/02/2024","02/02/2024");
          show1.addSeat(new Seat("401",SeatType.ECONOMY, 100));
          cinema1.addShow(show1);
          bookMyShow.addCinema(city1,cinema1);

          Booking booking = bookMyShow.bookSeat(user1,city1,"Jawaan");
          System.out.println(booking);

    }
}