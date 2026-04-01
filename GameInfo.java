class GameInfo {

    private int id;
    private String gameName;
    private String platform;
    private String genre;
    private String releaseDate;
    private String developer;
    private String publisher;
    private String rating;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
    public String getGameName() {
        return this.gameName;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
    public String getPlatform() {
        return this.platform;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return this.genre;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    public String getReleaseDate() {
        return this.releaseDate;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }
    public String getDeveloper() {
        return this.developer;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getPublisher() {
        return this.publisher;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
    public String getRating() {
        return this.rating;
    }
}