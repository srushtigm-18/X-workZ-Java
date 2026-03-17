class Channel {
    int channelNumber;
    String programName;
    String timing;
    String host;
    double trpRating;

    public Channel(int channelNumber, String programName, String timing, String host, double trpRating) {
        this.channelNumber = channelNumber;
        this.programName = programName;
        this.timing = timing;
        this.host = host;
        this.trpRating = trpRating;
    }

    public void getChannelDetails() {
        System.out.println("Channel: " + this.channelNumber);
        System.out.println("Program: " + this.programName);
        System.out.println("Timing: " + this.timing);
        System.out.println("Host: " + this.host);
        System.out.println("TRP: " + this.trpRating);
    }
}
