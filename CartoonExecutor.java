class CartoonExecutor {
    public static void main(String[] args) {
        Cartoon cartoon1 = new Cartoon("Shinchan", "Hungama", "Comedy", "7PM", 
                                      "Hindi", "Daily Episodes");
        
        Cartoon cartoon2 = new Cartoon(15, 9, 20, 500);
        
        Cartoon cartoon3 = new Cartoon(true);
        
        Cartoon cartoon4 = new Cartoon(8.7);
        
        System.out.println("Cartoon Title: " + cartoon1.title);
        System.out.println("Cartoon Channel: " + cartoon1.channel);
        System.out.println("Cartoon Season: " + cartoon2.season);
        System.out.println("Cartoon Genre: " + cartoon1.genre);
        System.out.println("Cartoon Rating: " + cartoon2.rating);
        System.out.println("Cartoon Timing: " + cartoon1.timing);
        System.out.println("Cartoon Duration: " + cartoon2.duration);
        System.out.println("Cartoon Language: " + cartoon1.language);
        System.out.println("Cartoon EpisodesCount: " + cartoon2.episodesCount);
        System.out.println("Cartoon Episodes: " + cartoon1.episodes);
        System.out.println("Cartoon Dubbed: " + cartoon3.dubbed);
        System.out.println("Cartoon Popularity: " + cartoon4.popularity);
        System.out.println("");
    }
}
