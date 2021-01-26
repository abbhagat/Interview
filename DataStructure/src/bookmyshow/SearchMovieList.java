package bookmyshow;

import java.util.List;
import java.util.Map;

public class SearchMovieList {

    public Map<String, List<Mall>> getCinemaHallList(Map<String, Map<String, List<Mall>>> map, String movieName) {
        return null != map.get(movieName) ? map.get(movieName) : null;
    }
}
