class Channel {
    int channelNumber;
    String programName;
    String timing;
    String host;
    double trpRating;

    public void getChannelDetails() {
        System.out.println("Channel: " + this.channelNumber);
        System.out.println("Program: " + this.programName);
        System.out.println("Timing: " + this.timing);
        System.out.println("Host: " + this.host);
        System.out.println("TRP: " + this.trpRating);
    }
}