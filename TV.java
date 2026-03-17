class TV {
    String networkName;
    int networkId;
    String language;
    String genre;
    Channel channel;

    public TV(int networkId, String networkName, String language, String genre, Channel channel) {
        this.networkId = networkId;
        this.networkName = networkName;
        this.language = language;
        this.genre = genre;
        this.channel = channel;
    }

    public void getTVDetails() {
        System.out.println("Network: " + this.networkName);
        System.out.println("ID: " + this.networkId);
        System.out.println("Language: " + this.language);
        System.out.println("Genre: " + this.genre);
        this.channel.getChannelDetails();
        System.out.println("\n");
    }
}
