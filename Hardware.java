class Hardware {
    int configId;
    String ramSize;
    String storage;
    String gpuModel;
    double price;

    public void getHardwareDetails() {
        System.out.println("Config ID: " + this.configId);
        System.out.println("RAM: " + this.ramSize);
        System.out.println("Storage: " + this.storage);
        System.out.println("GPU: " + this.gpuModel);
        System.out.println("Price: " + this.price + "L Rs");
    }
}