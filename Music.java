class Music {
    private String genre;
    
    Music() {
        System.out.println("Music created");
    }
    
    public void setGenre(String genre) {
        this.genre = genre; 
    }
  
    public String getMusicInfo() {
        return genre;
    }
}

