class Movie {
    static String movieTitle;
    static String director;
    static String genre;
    static int releaseYear;
    static String leadActor;
    static double rating;
    static String duration;

    public static boolean createMovie(String title, String directorName, String movieGenre, 
                                    int year, String actor, double movieRating, String movieDuration) {
        boolean isMovieCreated = false;

        boolean isTitleValid = false;
        boolean isDirectorValid = false;
        boolean isGenreValid = false;
        boolean isYearValid = false;
        boolean isActorValid = false;
        boolean isRatingValid = false;
        boolean isDurationValid = false;

        if (title != null && !title.isEmpty()) {
            movieTitle = title;
            isTitleValid = true;
        } else {
            System.out.println("The movie title is not valid");
        }

        if (directorName != null && !directorName.isEmpty()) {
            director = directorName;
            isDirectorValid = true;
        } else {
            System.out.println("The director name is not valid");
        }

        if (movieGenre != null && !movieGenre.isEmpty()) {
            genre = movieGenre;
            isGenreValid = true;
        } else {
            System.out.println("The genre is not valid");
        }

        if (year > 1880 && year <= 2026) {
            releaseYear = year;
            isYearValid = true;
        } else {
            System.out.println("The release year is not valid");
        }

        if (actor != null && !actor.isEmpty()) {
            leadActor = actor;
            isActorValid = true;
        } else {
            System.out.println("The lead actor is not valid");
        }

        if (movieRating >= 0 && movieRating <= 10.0) {
            rating = movieRating;
            isRatingValid = true;
        } else {
            System.out.println("The rating must be between 0 and 10.0");
        }

        if (movieDuration != null && !movieDuration.isEmpty()) {
            duration = movieDuration;
            isDurationValid = true;
        } else {
            System.out.println("The duration is not valid");
        }

        if (isTitleValid && isDirectorValid && isGenreValid && isYearValid && 
            isActorValid && isRatingValid && isDurationValid) {
            isMovieCreated = true;
        }
        return isMovieCreated;
    }

    public static void getMovieDetails() {
        System.out.println("------Movie Details-----");
        System.out.println("Title: " + movieTitle);
        System.out.println("Director: " + director);
        System.out.println("Genre: " + genre);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Lead Actor: " + leadActor);
        System.out.println("Rating: " + rating + "/10");
        System.out.println("Duration: " + duration);
       
    }
}

