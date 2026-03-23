class Movie {
    private String title;
    
    Movie() {
        System.out.println("Movie created");
    }
    public void setTitle(String title) {
		this.title = title; } 
  
    public String getMovieInfo() {
        return title;
    }
    
    
}