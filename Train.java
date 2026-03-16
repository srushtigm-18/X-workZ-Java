class Train {
    String trainName;
    int trainId;
    String source;
    String destination;
    Bogie bogie;

    public void getTrainDetails() {
        System.out.println("Train Name: " + this.trainName);
        System.out.println("Train ID: " + this.trainId);
        System.out.println("Source: " + this.source);
        System.out.println("Destination: " + this.destination);
        this.bogie.getBogieDetails();
        System.out.println("\n");
    }
}
