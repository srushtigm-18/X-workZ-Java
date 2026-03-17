class Rythms {
    int academyId;
    String academyName;
    String location;
    String genre;
    MusicInstrument instrument;

    public Rythms(int academyId, String academyName, String location, String genre, MusicInstrument instrument) {
        this.academyId = academyId;
        this.academyName = academyName;
        this.location = location;
        this.genre = genre;
        this.instrument = instrument;
    }

    public void getRythmsDetails() {
        System.out.println("Academy: " + this.academyName);
        System.out.println("ID: " + this.academyId);
        System.out.println("Location: " + this.location);
        System.out.println("Genre: " + this.genre);
        this.instrument.getInstrumentDetails();
        System.out.println("\n");
    }
}
