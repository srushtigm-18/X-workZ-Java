class Train {
    int trainId;
    String trainName;
    String source;
    String destination;
    Bogie bogie;

    public Train(int trainId, String trainName, String source, String destination, Bogie bogie) {
        this.trainId = trainId;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.bogie = bogie;
    }

    public void getTrainDetails() {
        System.out.println("Train: " + this.trainName);
        System.out.println("ID: " + this.trainId);
        System.out.println("Source: " + this.source);
        System.out.println("Destination: " + this.destination);
        this.bogie.getBogieDetails();
        System.out.println("\n");
    }
}
