class MusicInstrument {
    int instrumentId;
    String instrumentName;
    String type;
    double price;
    String material;

    public MusicInstrument(int instrumentId, String instrumentName, String type, double price, String material) {
        this.instrumentId = instrumentId;
        this.instrumentName = instrumentName;
        this.type = type;
        this.price = price;
        this.material = material;
    }

    public void getInstrumentDetails() {
        System.out.println("Instrument ID: " + this.instrumentId);
        System.out.println("Name: " + this.instrumentName);
        System.out.println("Type: " + this.type);
        System.out.println("Price: " + this.price);
        System.out.println("Material: " + this.material);
    }
}
