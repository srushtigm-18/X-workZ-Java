class TV {
    String networkName;
    int networkId;
    String language;
    String genre;
    Channel channel;

    public void getTVDetails() {
        System.out.println("Network: " + this.networkName);
        System.out.println("ID: " + this.networkId);
        System.out.println("Language: " + this.language);
        System.out.println("Genre: " + this.genre);
        this.channel.getChannelDetails();
        System.out.println("\n");
    }
}


