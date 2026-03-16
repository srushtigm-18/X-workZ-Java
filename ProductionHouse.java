class ProductionHouse {
    String studioName;
    int studioId;
    String founder;
    String location;
    Movie movie;

    public void getStudioDetails() {
        System.out.println("Studio: " + this.studioName);
        System.out.println("ID: " + this.studioId);
        System.out.println("Founder: " + this.founder);
        System.out.println("Location: " + this.location);
        this.movie.getMovieDetails();
        System.out.println("\n");
    }
}
