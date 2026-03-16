class Pc {
    String pcModel;
    int pcId;
    String brand;
    String processor;
    Hardware hardware;

    public void getPcDetails() {
        System.out.println("PC Model: " + this.pcModel);
        System.out.println("ID: " + this.pcId);
        System.out.println("Brand: " + this.brand);
        System.out.println("Processor: " + this.processor);
        this.hardware.getHardwareDetails();
        System.out.println("\n");
    }
}

