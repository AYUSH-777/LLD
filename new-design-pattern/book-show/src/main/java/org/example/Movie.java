package org.example;

public class Movie {
    private String movieId;
    private String movieName;
    private MovieType movieType;

    public Movie(String movieId, String movieName, MovieType movieType) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieType = movieType;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }
}
