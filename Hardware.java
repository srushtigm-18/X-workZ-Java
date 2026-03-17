class Hardware {
    int configId;
    String ramSize;
    String storage;
    String gpuModel;
    double price;

    public Hardware(int configId, String ramSize, String storage, String gpuModel, double price) {
        this.configId = configId;
        this.ramSize = ramSize;
        this.storage = storage;
        this.gpuModel = gpuModel;
        this.price = price;
    }

    public void getHardwareDetails() {
        System.out.println("Config ID: " + this.configId);
        System.out.println("RAM: " + this.ramSize);
        System.out.println("Storage: " + this.storage);
        System.out.println("GPU: " + this.gpuModel);
        System.out.println("Price: " + this.price + "L Rs");
    }
}
