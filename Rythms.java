class Rythms {
    String academyName;
    int academyId;
    String location;
    String genre;
    MusicInstrument instrument;

    public void getRythmsDetails() {
        System.out.println("Academy: " + this.academyName);
        System.out.println("ID: " + this.academyId);
        System.out.println("Location: " + this.location);
        System.out.println("Genre: " + this.genre);
        this.instrument.getInstrumentDetails();
        System.out.println("\n");
    }
}

