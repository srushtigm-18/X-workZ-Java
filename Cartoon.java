class Cartoon {
    String title;
    String channel;
    String genre;
    String timing;
    String language;
    String episodes;
    int season;
    int rating;
    int duration;
    int episodesCount;
    boolean dubbed;
    double popularity;
    
    Cartoon(String title, String channel, String genre, String timing, 
            String language, String episodes) {
        this.title = title;
        this.channel = channel;
        this.genre = genre;
        this.timing = timing;
        this.language = language;
        this.episodes = episodes;
    }
    
    Cartoon(int season, int rating, int duration, int episodesCount) {
        this.season = season;
        this.rating = rating;
        this.duration = duration;
        this.episodesCount = episodesCount;
    }
    
    Cartoon(boolean dubbed) {
        this.dubbed = dubbed;
    }
    
    Cartoon(double popularity) {
        this.popularity = popularity;
    }
}

