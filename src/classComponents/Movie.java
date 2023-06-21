package classComponents;

public class Movie {
    int movieId;
    String movieName;
    int moviePrice;

    //no-arguments constructor
    public Movie() {
    }

    public Movie(int movieId) {
        this.movieId = movieId;
    }

    public Movie(String movieName) {
        this.movieName = movieName;
    }


    //all arguments constructor
    public Movie(int movieId, String movieName, int moviePrice) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.moviePrice = moviePrice;
    }

    public static void main(String[] args) {
        Movie movie = new Movie(1, "Flash",1000);
        System.out.println("Movie : " + movie.movieId + "\t" + movie.movieName + "\t" + movie.moviePrice);

        Movie movie1 = new Movie();
        System.out.println("Movie : " + movie1.movieId + "\t" + movie1.movieName + "\t" + movie1.moviePrice);
    }
}
