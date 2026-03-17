class BigDaddy {
    String casinoName;
    int casinoId;
    String location;
    String owner;
    Cassino cassino;

    public BigDaddy(String casinoName, int casinoId, String location, String owner, Cassino cassino) {
        this.casinoName = casinoName;
        this.casinoId = casinoId;
        this.location = location;
        this.owner = owner;
        this.cassino = cassino;
    }

    public void getCasinoDetails() {
        System.out.println("Casino: " + this.casinoName);
        System.out.println("ID: " + this.casinoId);
        System.out.println("Location: " + this.location);
        System.out.println("Owner: " + this.owner);
        this.cassino.getCassinoDetails();
        System.out.println("\n");
    }
}
