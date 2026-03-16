class Movie {
    int movieId;
    String title;
    String director;
    String genre;
    double boxOfficeCr;

    public void getMovieDetails() {
        System.out.println("Movie ID: " + this.movieId);
        System.out.println("Title: " + this.title);
        System.out.println("Director: " + this.director);
        System.out.println("Genre: " + this.genre);
        System.out.println("Box Office: ₹" + this.boxOfficeCr + "Cr");
    }
}
 