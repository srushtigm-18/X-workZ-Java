class MovieExecutor {
    public static void main(String[] args) {
      
        boolean created1 = Movie.createMovie("RRR","S.S. Rajamouli","Action Drama", 
               2022, "N.T. Rama Rao Jr.", 8.8, "3h 7m");
        
        if (created1) {
            System.out.println("RRR Movie created successfully!");
            Movie.getMovieDetails();
        } else {
            System.out.println("RRR Movie creation failed!");
        }

 
        boolean created2 = Movie.createMovie("Oppenheimer",  "Christopher Nolan", "Biography Drama",  2023, 
                                           "Cillian Murphy",  8.4, "3h");
        
        if (created2) {
            System.out.println("Oppenheimer Movie created successfully!");
            Movie.getMovieDetails();
        } else {
            System.out.println("Oppenheimer Movie creation failed!");
        }

    }
}
