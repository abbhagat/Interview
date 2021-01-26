package bookmyshow;

import java.text.*;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class BookMyShow {

    public static Map<String, Map<String, List<Mall>>> map;
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");

    void initializeMap() {
        Mall m1 = new Mall();
        m1.setTotalSeatCapacity(100);
        m1.setCurrentDate(new Date(sdf.format(new Date())));
        //m1.setStartTime(startTime);
    }

    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.initializeMap();
        SearchMovieList list = new SearchMovieList();
        ConcurrentHashMap<String, ArrayList<Mall>> cinemaHall = null; //= list.getCinemaHallList("XYZ");
        ArrayList<Mall> movieList = cinemaHall.get("Inorbit");
        for (Mall movie : movieList) {
            Date bookingTime = new Date();
            if (movie.getTotalSeatCapacity() > 0) {
                if (movie.getStartTime().before(bookingTime)) {
                    movie.setTotalSeatCapacity(movie.getTotalSeatCapacity() + 1);
                    System.out.println("Ticket booked successfully");
                    break;
                }
            }
        }
    }
}
